# Backend_Liv2Train     ---        Setup   &&  API Documentation

## Setup:

  -> Process-1: (Using Docker)
  -----------------------------------------------------------------
         - Use "docker-compose up -d" to start the application and all aditional services. (This Process will take some time to start)
         
   
   -> Process-2:
  -----------------------------------------------------------------
         - Locally, Create a mysql database called "liv2train"
         - goto "/src/main/resources/application.properties" and change port to 3306(default mysql port).
         - After successfully resolving maven dependencies, run the "/src/main/java/com/ishmamruhan/Liv2Train/MvpApplication.java" file 
           and the application will started
           

## API Documentation:

  -> API-1:      localhost:8081/api/v1/training-center/save
          
          Description: Create/Save 1(one) Training Center
          Response Body:
                           {
                               "name": "Test-01",
                               "code": 123456789123,
                               "address":{
                                      "details" : "description goes here",
                                      "city": "Dhaka",
                                      "state": "Bangladesh",
                                      "pincode": "2AB4"
                                },
                               "capacity": 250,
                               "email": "email@email.com",
                               "phone": "01317092660"
                           }
                           
                           
  -> API-2:        localhost:8081/api/v1/training-center/save-all
                    
              Description: Create/Save multiple Training Centers
              Response Body:
                     [      
                           {
                               "name": "Test-01",
                               "code": 123456789123,
                               "address":{
                                      "details" : "description goes here",
                                      "city": "Dhaka",
                                      "state": "Bangladesh",
                                      "pincode": "2AB4"
                                },
                               "capacity": 250,
                               "email": "email@email.com",
                               "phone": "01317092660"
                           },
                           {
                               "name": "Test-02",
                               "code": 123456789123,
                               "address":{
                                      "details" : "description goes here",
                                      "city": "Dhaka",
                                      "state": "Bangladesh",
                                      "pincode": "2AB4"
                                },
                               "capacity": 250,
                               "email": "email@email.com",
                               "phone": "01317092660"
                           }
                    ]
                    
                    
  -> API-3:        localhost:8081/api/v1/training-center/get-all
            
              Description: Get/View/Show ALL training centers.
              Response Body:
                     [      
                           {
                               "id": 1,
                               "name": "Test-01",
                               "code": 123456789123,
                               "address":{
                                      "id": 1,
                                      "details" : "description goes here",
                                      "city": "Dhaka",
                                      "state": "Bangladesh",
                                      "pincode": "2AB4"
                                },
                               "capacity": 250,
                               "courses": [],
                               "email": "email@email.com",
                               "phone": "01317092660",
                               "created_at": "18:21:56 15/02/2022"
                           }
                    ]
                    
                    
             
  -> API-4:        localhost:8081/api/v1/training-center/get/id/1
            
              Description: Get/View/Show training center by id
              Response Body:
                           {
                               "id": 1,
                               "name": "Test-01",
                               "code": 123456789123,
                               "address":{
                                      "id": 1,
                                      "details" : "description goes here",
                                      "city": "Dhaka",
                                      "state": "Bangladesh",
                                      "pincode": "2AB4"
                                },
                               "capacity": 250,
                               "courses": [],
                               "email": "email@email.com",
                               "phone": "01317092660",
                               "created_at": "18:21:56 15/02/2022"
                           }
                           
            
            
  -> API-5:        localhost:8081/api/v1/training-center/get/code/123456789123
            
              Description: Get/View/Show training center by training center code
              Response Body:
                           {
                               "id": 1,
                               "name": "Test-01",
                               "code": 123456789123,
                               "address":{
                                      "id": 1,
                                      "details" : "description goes here",
                                      "city": "Dhaka",
                                      "state": "Bangladesh",
                                      "pincode": "2AB4"
                                },
                               "capacity": 250,
                               "courses": [],
                               "email": "email@email.com",
                               "phone": "01317092660",
                               "created_at": "18:21:56 15/02/2022"
                           }          
                   
            
                        
