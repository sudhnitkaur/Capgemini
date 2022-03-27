const txt = '{"name":"Sudhnit", "lastNAme":"Kaur"}'
var store = JSON.parse(txt);

console.log(store)

var str = ({
    firstName : "Sudhnit",
    lastName : "Kaur"
})

var res = eval(str);
console.log(res);

console.log(typeof(str));