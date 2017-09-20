var app = {
    initialize: function() {
        this.bindEvents();
    },

    bindEvents: function() {
        document.addEventListener('deviceready', this.onDeviceReady, false);
    },

    onDeviceReady: function() {
        document.getElementById("btn-plugin-toast").addEventListener("click",function () {
            //调用ZHToast插件的getToast方法
            cordova.exec(function(resp) {
                    alert("success");
                    alert(resp);
                },
                function(resp) {
                    alert("fail");
                    alert(resp);
                },
                "ZHToast",
                "getToast",
                ["this is a test",0]);
        });
    }
};

app.initialize();