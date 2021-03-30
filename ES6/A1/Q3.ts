// 1 2 3

//3cd A1
let Order = {
    id : 12,
    title : "Doll",
    price : 20,
    printOrder(){
        console.log(this.id);
        console.log(this.title);
        console.log(this.price);
    },
    getPrice(){
        console.log(this.price);
    }
}
Order.printOrder();
Order.getPrice();
// uncomment these two lines
//const newOrder = Object.assign({},Order);
//console.log(newOrder);
