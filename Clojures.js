function registerHandlers() {
   var as = document.getElementsByTagName('a');
   for (i = as.length-1; i >= 0; i--) {
     as[i].onclick = showAlert(i);
   }


   function showAlert(number){
     return function () {
       alert(number);
       return false;
     }
   }
}
