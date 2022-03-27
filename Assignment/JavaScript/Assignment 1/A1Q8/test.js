var arr1 = ['a','b','c'];
var arr2 = [1,2,3];

function concatArr(arr1, arr2){
    return arr1.concat(arr2);
}
document.getElementById("demo").innerHTML = concatArr(arr1, arr2);