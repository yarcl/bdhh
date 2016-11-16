<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="css/common.css">
  <link rel="stylesheet" href="css/style.css">
  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
  <script type="text/javascript">
  $(function(){
      $(".sideMenu").slide({
         titCell:"h3", 
         targetCell:"ul",
         defaultIndex:0, 
         effect:'slideDown', 
         delayTime:'500' , 
         trigger:'click', 
         triggerTime:'150', 
         defaultPlay:true, 
         returnDefault:false,
         easing:'easeInQuint',
         endFun:function(){
              scrollWW();
         }
       });
      $(window).resize(function() {
          scrollWW();
      });
  });
  function scrollWW(){
    if($(".side").height()<$(".sideMenu").height()){
       $(".scroll").show();
       var pos = $(".sideMenu ul:visible").position().top-38;
       $('.sideMenu').animate({top:-pos});
    }else{
       $(".scroll").hide();
       $('.sideMenu').animate({top:0});
       n=1;
    }
  } 

var n=1;
function menuScroll(num){
  var Scroll = $('.sideMenu');
  var ScrollP = $('.sideMenu').position();
  /*alert(n);
  alert(ScrollP.top);*/
  if(num==1){
     Scroll.animate({top:ScrollP.top-38});
     n = n+1;
  }else{
    if (ScrollP.top > -38 && ScrollP.top != 0) { ScrollP.top = -38; }
    if (ScrollP.top<0) {
      Scroll.animate({top:38+ScrollP.top});
    }else{
      n=1;
    }
    if(n>1){
      n = n-1;
    }
  }
}
  </script>
  <title>后台首页</title>
</head>
<body>
    <div class="top">
      <div id="top_t">
        <div id="logo" class="fl"></div>
        <div id="photo_info" class="fr">
          <div id="photo" class="fl">
            <a href="#"><img src="images/a.png" alt="" width="60" height="60"></a>
          </div>
          <div id="base_info" class="fr">
            <div class="help_info">
              <a href="1" id="hp">&nbsp;</a>
              <a href="2" id="gy">&nbsp;</a>
              <a href="3" id="out">&nbsp;</a>
            </div>
            <div class="info_center">
              admin
              <span id="nt">通知</span><span><a href="#" id="notice">3</a></span>
            </div>
          </div>
        </div>
      </div>
      <div id="side_here">
        <div id="side_here_l" class="fl"></div>
        <div id="here_area" class="fl">当前位置：百度互换平台</div>
      </div>
    </div>
    <div class="side">
        <div class="sideMenu" style="margin:0 auto">
          <h3>项目管理</h3>
          <ul>
            <li><a href="project/add.html" target="right">项目创建</a></li>
            <li><a href="project/list.html" target="right">进行中项目</a></li>
            <li><a href="project/listFail.html" target="right">失败项目</a></li>
            <li><a href="project/listSuccess.html" target="right">满标项目</a></li>
          </ul>
          <h3>投后管理</h3>
          <ul>
			<li><a href="loan/list.html" target="right">放款明细</a></li>
          </ul>
          <h3>订单管理</h3>
          <ul>
     	    <li><a href="order/list.html" target="right">订单明细</a></li>
          </ul>
          <h3>配送管理</h3>
          <ul>
          	<li><a href="peisong/list.html" target="right">配送明细</a></li>
          </ul>
          <h3>财务管理</h3>
          <ul>
           	<li><a href="finance/list.html" target="right">收款明细</a></li>
            <li><a href="finance/listPre.html" target="right">放款审核</a></li>
            <li><a href="finance/listSend.html" target="right">放款明细</a></li>
            <li><a href="finance/listSended.html" target="right">已放款明细</a></li>
          </ul>
          <!-- <h3>内容管理</h3>
          <ul>
            <li><a href="#">广告管理</a></li>
            <li><a href="#">资讯管理</a></li>
            <li><a href="#">置顶管理</a></li>
          </ul> -->
 			
          <h3>权限管理</h3>
          <ul>
            <li><a href="org/user/list.html" target="right">用户管理</a></li>
            <li><a href="org/role/list.html" target="right">角色管理</a></li>
            <li><a href="org/menu/list.html" target="right">资源管理</a></li>
          </ul>
            
          <h3>系统设置</h3>
          <ul>
          	<li><a href="ps/info.html" target="right">个人信息</a></li>
            <li><a href="ps/password.html" target="right">修改密码</a></li>
          </ul>
 
 

       </div>
    </div>
    <div class="main">
       <iframe name="right" id="rightMain" src="main.html" frameborder="no" scrolling="auto" width="100%" height="auto" allowtransparency="true"></iframe>
    </div>
    <div class="bottom">
      <div id="bottom_bg">版权</div>
    </div>
    <div class="scroll">
          <a href="javascript:;" class="per" title="使用鼠标滚轴滚动侧栏" onclick="menuScroll(1);"></a>
          <a href="javascript:;" class="next" title="使用鼠标滚轴滚动侧栏" onclick="menuScroll(2);"></a>
    </div>
</body>
</html>