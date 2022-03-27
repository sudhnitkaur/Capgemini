var n = prompt("Enter the Number");
var sum = 0;
for(i=1; i<=n; i++){
    sum+=i;
}
//console.log(sum);
document.getElementById("num").innerHTML = sum;