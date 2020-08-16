* Total 3 MicroServices
	1. oms-eureka - EUreka Server Service
	2. oms-item-service - Order Item detail service
	3. oms-order-service - Order create and retrive Service

* Start By order


Create API Request 1:

	POST : http://localhost:9092/api/order/create
	
	{
	"customerName":"maheen",
	"shippingAddress":{
		"houseNo":"2222",
		"street":"mg road",
		"city":"Bangalore",
		"country":"india",
		"pin":"999898"
	},
	"orderItems":[
    {
        "productCode": "33333",
        "productName": "Mouse",
        "quantity": 1,
        "price":100.00
    },
    {
        "productCode": "22222",
        "productName": "KeyBoard",
        "quantity": 1,
        "price":500.50
    },
    {
        "productCode": "1111",
        "productName": "Monitor",
        "quantity": 1,
        "price":200.00
    }
  ]
}

Create API Response:

	Order created Successfully !!
	
	**********************
	 Request 2:
	 
	  {
        "customerName": "sunil",
        "shippingAddress": {
            "houseNo": "4444",
            "street": "mg road",
            "city": "Chennai",
            "country": "india",
            "pin": "999898"
        },
        "orderItems": [
            {
                "productCode": "444",
                "productName": "Mouse",
                "quantity": 2,
                "price": 100
            },
            {
                "productCode": "555",
                "productName": "KeyBoard",
                "quantity": 1,
                "price": 500.5
            },
            {
                "productCode": "7777",
                "productName": "Monitor",
                "quantity": 2,
                "price": 200
            }
        ]
    }
	 
*****************	 
	 
---------------------------------------------------------------------	
	
Order View API Request:

GET : http://localhost:9092/api/order/retrive

Response :

[
    {
        "customerName": "sunil",
        "orderDate": "16/08/2020",
        "shippingAddress": {
            "houseNo": "4444",
            "street": "mg road",
            "city": "Chennai",
            "country": "india",
            "pin": "999898"
        },
        "orderItems": [
            {
                "productCode": "444",
                "productName": "Mouse",
                "quantity": 2,
                "price": 100,
                "orderId": 1597592377395
            },
            {
                "productCode": "555",
                "productName": "KeyBoard",
                "quantity": 1,
                "price": 500.5,
                "orderId": 1597592377395
            },
            {
                "productCode": "7777",
                "productName": "Monitor",
                "quantity": 2,
                "price": 200,
                "orderId": 1597592377395
            }
        ],
        "total": 1100.5
    },
    {
        "customerName": "maheen",
        "orderDate": "16/08/2020",
        "shippingAddress": {
            "houseNo": "2222",
            "street": "mg road",
            "city": "Bangalore",
            "country": "india",
            "pin": "999898"
        },
        "orderItems": [
            {
                "productCode": "33333",
                "productName": "Mouse",
                "quantity": 1,
                "price": 100,
                "orderId": 1597592563897
            },
            {
                "productCode": "22222",
                "productName": "KeyBoard",
                "quantity": 1,
                "price": 500.5,
                "orderId": 1597592563897
            },
            {
                "productCode": "1111",
                "productName": "Monitor",
                "quantity": 1,
                "price": 200,
                "orderId": 1597592563897
            }
        ],
        "total": 800.5
    }
]
 


	
	