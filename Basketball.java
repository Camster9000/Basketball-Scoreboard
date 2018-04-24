var clock_going = 0;

$(document).ready(function(){


  // SHOW AD ad_msg
  $("#show_ad").click(function() {
    $("#subscoreboard").css({"margin-top":"0"});
    $("#subscoreboard").html($("#ad_msg").val());
  });
  $("#show_ad_1").click(function() {
    $("#subscoreboard").css({"margin-top":"0"});
    $("#subscoreboard").html("Follow us on twitter. @wasportsnetwork");
    $("#ad_msg").val("Follow us on twitter. @wasportsnetwork");
  });
  $("#show_ad_2").click(function() {
    $("#subscoreboard").css({"margin-top":"0"});
    $("#subscoreboard").html("Like our broadcast? Let us know: comments@wasportsnetwork.com");
    $("#ad_msg").val("Like our broadcast? Let us know: comments@wasportsnetwork.com");
  });
  $(".hide_ad").click(function() {
    $("#subscoreboard").css({"margin-top":"-42px"});
  });



  // TEAM 1 SCORE

  $("#team1_plus6").click(function() {
    var oldscore = parseInt($("#team1_score_input").val(), 10);
    var newscore = oldscore+6;
    $("#team1_score_input").val(newscore);
    $("#team1_score").text(newscore);
  });
  $("#team1_plus1").click(function() {
    var oldscore = parseInt($("#team1_score_input").val(), 10);
    var newscore = oldscore+1;
    $("#team1_score_input").val(newscore);
    $("#team1_score").text(newscore);
  });
  $("#team1_plus3").click(function() {
    var oldscore = parseInt($("#team1_score_input").val(), 10);
    var newscore = oldscore+3;
    $("#team1_score_input").val(newscore);
    $("#team1_score").text(newscore);
  });
  $("#team1_plus2").click(function() {
    var oldscore = parseInt($("#team1_score_input").val(), 10);
    var newscore = oldscore+2;
    $("#team1_score_input").val(newscore);
    $("#team1_score").text(newscore);
  });
  $("#team1_score_update").click(function() {
    var newscore = parseInt($("#team1_score_input").val(), 10);
    $("#team1_score_input").val(newscore);
    $("#team1_score").text(newscore);
  });
  $("#team1_score_input").keyup(function(event){
    if(event.keyCode == 13){
      $("#team1_score_update").click();
    }
  });


  // TEAM 2 SCORE

  $("#team2_plus6").click(function() {
    var oldscore = parseInt($("#team2_score_input").val(), 10);
    var newscore = oldscore+6;
    $("#team2_score_input").val(newscore);
    $("#team2_score").text(newscore);
  });
  $("#team2_plus1").click(function() {
    var oldscore = parseInt($("#team2_score_input").val(), 10);
    var newscore = oldscore+1;
    $("#team2_score_input").val(newscore);
    $("#team2_score").text(newscore);
  });
  $("#team2_plus3").click(function() {
    var oldscore = parseInt($("#team2_score_input").val(), 10);
    var newscore = oldscore+3;
    $("#team2_score_input").val(newscore);
    $("#team2_score").text(newscore);
  });
  $("#team2_plus2").click(function() {
    var oldscore = parseInt($("#team2_score_input").val(), 10);
    var newscore = oldscore+2;
    $("#team2_score_input").val(newscore);
    $("#team2_score").text(newscore);
  });
  $("#team2_score_update").click(function() {
    var newscore = parseInt($("#team2_score_input").val(), 10);
    $("#team2_score_input").val(newscore);
    $("#team2_score").text(newscore);
  });
  $("#team2_score_input").keyup(function(event){
    if(event.keyCode == 13){
      $("#team2_score_update").click();
    }
  });



  // TIMEOUTS
  // RED = 9a0a10
  // GRAY = a1a1a1
  // BLUE (CV) = 003fb7
  $("#team1_3to").click(function() {
    $("#team1_to1").css({"background":"#9a0a10"});
    $("#team1_to2").css({"background":"#9a0a10"});
    $("#team1_to3").css({"background":"#9a0a10"});
  });
  $("#team1_2to").click(function() {
    $("#team1_to1").css({"background":"#9a0a10"});
    $("#team1_to2").css({"background":"#9a0a10"});
    $("#team1_to3").css({"background":"#a1a1a1"});
  });
  $("#team1_1to").click(function() {
    $("#team1_to1").css({"background":"#9a0a10"});
    $("#team1_to2").css({"background":"#a1a1a1"});
    $("#team1_to3").css({"background":"#a1a1a1"});
  });
  $("#team1_0to").click(function() {
    $("#team1_to1").css({"background":"#a1a1a1"});
    $("#team1_to2").css({"background":"#a1a1a1"});
    $("#team1_to3").css({"background":"#a1a1a1"});
  });
  $("#team2_3to").click(function() {
    $("#team2_to1").css({"background":"#003fb7"});
    $("#team2_to2").css({"background":"#003fb7"});
    $("#team2_to3").css({"background":"#003fb7"});
  });
  $("#team2_2to").click(function() {
    $("#team2_to1").css({"background":"#003fb7"});
    $("#team2_to2").css({"background":"#003fb7"});
    $("#team2_to3").css({"background":"#a1a1a1"});
  });
  $("#team2_1to").click(function() {
    $("#team2_to1").css({"background":"#003fb7"});
    $("#team2_to2").css({"background":"#a1a1a1"});
    $("#team2_to3").css({"background":"#a1a1a1"});
  });
  $("#team2_0to").click(function() {
    $("#team2_to1").css({"background":"#a1a1a1"});
    $("#team2_to2").css({"background":"#a1a1a1"});
    $("#team2_to3").css({"background":"#a1a1a1"});
  });



  // DOWN DIST MESSAGE
  $("#show_msg").click(function() {
    $("#downdist").text($("#downdist_input").val());
  });
  $("#downdist_input").keyup(function(event){
    if(event.keyCode == 13){
      $("#show_msg").click();
    }
  });
  $("#show_kickoff").click(function() {
    $("#downdist").text("Kickoff");
    $("#pos_off").click();
  });
  $("#show_1st10").click(function() {
    $("#downdist").text("1st & 10");
  });
  $("#show_timeout").click(function() {
    $("#downdist").text("Timeout");
  });


  // QUARTER
  $("#qtr_1").click(function() {
    $("#qtr").text("1st Qtr");
  });
  $("#qtr_2").click(function() {
    $("#qtr").text("2nd Qtr");
    $('#clock_input_min').val("12");
    $('#clock_input_sec').val("00");
    $('#clock_update').click();
  });
  $("#qtr_3").click(function() {
    $("#qtr").text("3rd Qtr");
    $('#clock_input_min').val("12");
    $('#clock_input_sec').val("00");
    $("#team1_3to").click();
    $("#team2_3to").click();
    $('#clock_update').click();
  });
  $("#qtr_4").click(function() {
    $("#qtr").text("4th Qtr");
    $('#clock_input_min').val("12");
    $('#clock_input_sec').val("00");
    $('#clock_update').click();
  });
  $("#qtr_ot").click(function() {
    $("#qtr").text("OT");
  });
  $("#qtr_half").click(function() {
    $("#qtr").text("Half");
    $("#downdist").text("");
    $('#clock_input_min').val("20");
    $('#clock_input_sec').val("00");
    $('#clock_update').click();
    $('#clock_start').click();
  });
  $("#qtr_final").click(function() {
    $("#qtr").text("FINAL");
    $("#downdist").text("");
    $("#clock").css({"visibility":"hidden"});
    $("#pos_off").click();
    $("#team1_0to").click();
    $("#team2_0to").click();
  });


  //POS
  $("#team1_pos").click(function() {
    $("#team1_pos_arrow").css({"visibility":"visible"});
    $("#team2_pos_arrow").css({"visibility":"hidden"});
  });
  $("#team2_pos").click(function() {
    $("#team2_pos_arrow").css({"visibility":"visible"});
    $("#team1_pos_arrow").css({"visibility":"hidden"});
  });
  $("#pos_off").click(function() {
    $("#team2_pos_arrow").css({"visibility":"hidden"});
    $("#team1_pos_arrow").css({"visibility":"hidden"});
  });


  //FLAG
  $("#flag_on").click(function() {
    $("#flag").css({"display":"block"});
    $("#downdist").css({"display":"none"});
  });
  $("#flag_off").click(function() {
    $("#flag").css({"display":"none"});
    $("#downdist").css({"display":"block"});
  });


  // CLOCK
  $("#clock_start").click(function() {
    if(clock_going == 0) {
    clock = setInterval('countdown()',1000);
    clock_going = 1;
    }
  });

  $("#clock_stop").click(function() {
    clearInterval(clock);
    clock_going = 0;
    $("#clock_input_min").val($('#clock_min').html());
    $("#clock_input_sec").val($('#clock_sec').html());
  });

  $("#clock_update").click(function() {
    //clock_going = 0; clearInterval(clock); // THIS WOULD STOP THE CLOCK WHILE UPDATING - uncomment if needed
    $('#clock_min').html($("#clock_input_min").val());
    $('#clock_sec').html($("#clock_input_sec").val());
  });

  $("#clock_plus").click(function() {

    clearInterval(clock);
    var m = $('#clock_min');
    var s = $('#clock_sec');
    if((parseInt(s.html())==59)) {
      m.html(parseInt(m.html())+1);
      s.html("00");
    } else {
      if((parseInt(s.html())+1) < 10) { s.html("0" + (parseInt(s.html())+1)); } else {
      s.html(parseInt(s.html())+1); }
    }
    if(clock_going == 1) { clock = setInterval('countdown()',1000); }

    $("#clock_input_min").val($('#clock_min').html());
    $("#clock_input_sec").val($('#clock_sec').html());

  });

  $("#clock_minus").click(function() {

    clearInterval(clock);
    var m = $('#clock_min');
    var s = $('#clock_sec');
    if((parseInt(s.html())==00)) {
      m.html(parseInt(m.html())-1);
      s.html("59");
    } else {
      if((parseInt(s.html())-1) < 10) { s.html("0" + (parseInt(s.html())-1)); } else {
      s.html(parseInt(s.html())-1); }
    }
    if(clock_going == 1) { clock = setInterval('countdown()',1000); }

    $("#clock_input_min").val($('#clock_min').html());
    $("#clock_input_sec").val($('#clock_sec').html());

  });

  $("#clock_input_min").keyup(function(event){
    if(event.keyCode == 13){
      $("#clock_update").click();
    }
  });

  $("#clock_input_sec").keyup(function(event){
    if(event.keyCode == 13){
      $("#clock_update").click();
    }
  });

});

//http://www.makewebgames.com/showthread.php/38968-jQuery-Second-Minute-Countdown

function countdown() {
  var m = $('#clock_min');
  var s = $('#clock_sec');
  if(m.html() == "0" && s.html() == "00") {
    clearInterval(clock);
    clock_going = 0;
    return;
  }
  if(parseInt(s.html()) <= 0) {
      m.html(parseInt(m.html()-1));
      s.html(60);
  }
  if((parseInt(s.html()-1)<10)) { s.html("0" + parseInt(s.html()-1)); } else {
  s.html(parseInt(s.html()-1)); }
}

$(document).keyup(function(event){
    if(event.keyCode == 37){ //left
      $("#clock_start").click();
    }
    if(event.keyCode == 38){ //up
      $("#clock_plus").click();
    }
    if(event.keyCode == 39){ //right
      $("#clock_stop").click();
    }
    if(event.keyCode == 40){ //down
      $("#clock_minus").click();
    }
});
