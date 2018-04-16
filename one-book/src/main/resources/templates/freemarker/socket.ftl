<html>
<title>api server</title>
<body>
<script type="text/javascript" src="http://cdn.bootcss.com/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript" src="http://cdn.bootcss.com/sockjs-client/1.1.1/sockjs.js"></script>
<script type="text/javascript">
    var websocket = null;
    if ('WebSocket' in window) {
        //Websocket的连接wspai.chexiangpre.com
        websocket = new WebSocket("ws://localhost:8080/ws/web/jj?appOrigin=pm&auctionId=231");//WebSocket对应的地址
        //websocket = new WebSocket("ws://localhost:8080/websocket");//WebSocket对应的地址
    }
    else if ('MozWebSocket' in window) {
        //Websocket的连接
        websocket = new MozWebSocket("ws://localhost:8080/socketjs/pm");//SockJS对应的地址
    }
    else {
        //SockJS的连接
        websocket = new SockJS("http://localhost:8080/socketjs/pm");    //SockJS对应的地址
    }
    websocket.onopen = onOpen;
    websocket.onmessage = onMessage;
    websocket.onerror = onError;
    websocket.onclose = onClose;

    function onOpen(openEvt) {
        //alert(openEvt.Data);
        console.log(new Date())
    }

    function onMessage(evt) {
        console.log("收到推送消息："+evt.data);
    }
    function onError() {
        console.log("SOCKET连接异常。。。。");
    }
    function onClose() {
        console.log(new Date())
        console.log("SOCKET连接关闭。。。。");
    }

    window.onbeforeunload=function (event) {
        websocket.close();
    }

    function doSend() {
        if (websocket.readyState == websocket.OPEN) {
            var msg = document.getElementById("inputMsg").value;
            websocket.send(msg);//调用后台handleTextMessage方法
        } else {
            alert("连接失败!");
        }
    }

    window.close = function () {
        websocket.onclose();
    }
</script>
请输入：<textarea rows="3" cols="100" id="inputMsg" name="inputMsg"></textarea>
<button onclick="doSend();">发送</button>
</body>
</html>