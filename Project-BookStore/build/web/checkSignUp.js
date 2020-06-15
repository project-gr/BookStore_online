/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$('#username').keyup(function(){
    var username = $('#username').val();
   $('#status').html('<img src="username_loader.gif">');
   
   if(username !== ''){
       
   }
   else{
       $('#status').html('');
   }
    
});