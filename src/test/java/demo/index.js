const checkQQEmail = {
    init(param) {
        const that = this;
        const input = param.input;
        const output = param.output;
        if (!input || !output) return;
        // TODO: 请为input绑定blur事件，回调函数为_blur
        input.onblur =
        function _blur() {
            // TODO: 请获取input当前的值
            const content = input.value;
            const emails = that.getItems(content);
            // TODO: 请筛选出错误的emails中错误的QQ邮箱
            const error = [];
            for (var i = 0 ; i < emails.length ; i++){
                var item = emails[i]
                if (!that.isQQEmail(item)){
                    error.push(item)
                }
            }
            const map = {};
            error.forEach(item => (map[item] = true));
            const right = emails.filter(item => {
                // TODO: 请判断item是否重复出现过
                const isExist = false;
                for (var i = 0; i < emails.length; i++) {
                    if (emails[i] === item){
                        console.log("重复")
                        map[item] = isExist;
                    }
                }
                // TODO: 请填写正确的返回值，替换false
                // return map[item];
                return true;
            });
            console.log(map)
            console.log("right:"+right)
            // TODO: 请将数组right通过 \n 拼接，然后赋值给input节点
            input.value = right.join("\n");
            // TODO: 将数组error通过 \n 拼接，然后赋值给output节点
            output.value = error.join("\n");
        }
    },
    getItems(content) {
        // TODO: 请根据题目中给定的分隔符，将content分割成字符串数组，请去掉数组中的空白字符项
        var split = content.split(/[,， \n]/);
        // console.log(r);
        return split.filter(function (s) {
            return s && s.trim();
        });
    },
    isQQEmail(email) {
        // TODO: 请判断email是否是正确的QQ邮箱
        if (email !== "") {
            var reg = /^[1-9]\d{7,10}@qq\.com/;
            //调用正则验证test()函数
            isok = reg.test(email);
            if (!isok) {
                return false;
            }
        }
        return true;
    }
}
checkQQEmail.init({
    // TODO: 请获取class=input的节点
    input: document.getElementsByClassName("input")[0],
    // TODO: 请获取class=output的节点
    output: document.getElementsByClassName("output")[0],
});

