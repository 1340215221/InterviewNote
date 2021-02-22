// 用户表
users = [{
  _id: ObjectId("5af2b2c6b138c267e414c072"),
  uid: "uid000",
  name: "小红",
  age: 26
}, {
  _id: ObjectId("5af2b2c6b138c267e414c073"),
  uid: "uid001",
  name: "小芳",
  age: 27
}]

// 订单表
orders = [{
  _id: ObjectId("4af2b2c6b138c267e414c071"),
  uid: "uid000",
  product: "产品1",
  money: 100
}, {
  _id: ObjectId("4af2b2c6b138c267e414c072"),
  uid: "uid000",
  product: "产品2",
  money: 200
}, {
  _id: ObjectId("4af2b2c6b138c267e414c073"),
  uid: "uid001",
  product: "产品1",
  money: 100
}, {
  _id: ObjectId("4af2b2c6b138c267e414c074"),
  uid: "uid001",
  product: "产品2",
  money: 200
}]

// 连表语句
db.user.aggregate([{
  $lookup: { // 左连接
    from: "order", // 关联到order表
    localField: "uid", // user 表关联的字段
    foreignField: "uid", // order 表关联的字段
    as: "orders"
  }
}]);

// 连表结果
users = [{
  _id: ObjectId("5af2b2c6b138c267e414c072"),
  uid: "uid000",
  name: "小红",
  age: 26,
  orders: [{
    _id: ObjectId("4af2b2c6b138c267e414c071"),
    uid: "uid000",
    product: "产品1",
    money: 100
  }, {
    _id: ObjectId("4af2b2c6b138c267e414c072"),
    uid: "uid000",
    product: "产品2",
    money: 200
  }]
}, {
  _id: ObjectId("5af2b2c6b138c267e414c073"),
  uid: "uid001",
  name: "小芳",
  age: 27,
  orders: [{
    _id: ObjectId("4af2b2c6b138c267e414c073"),
    uid: "uid001",
    product: "产品1",
    money: 100
  }, {
    _id: ObjectId("4af2b2c6b138c267e414c073"),
    uid: "uid001",
    product: "产品1",
    money: 200
  }]
}]