//Create list of ints from 1 to 5, Haskell equivalent [1..5]
function arrFunc(start, end){
    let arr = [];
    for (let i = start; i<=end; i++) {
        arr.push(i);
    }
    return arr;    
}

function applicatorFunc(inpFunc, s){
    if(s=='s'){
        const arr = inpFunc;        
        let sum = arr.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
        return sum;
    }
    else{        
        const arr = inpFunc;
        let sum = arr.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
        return sum/inpFunc.length;
    }
}

let x = applicatorFunc(arrFunc(1, 5), 's');
console.log(x);