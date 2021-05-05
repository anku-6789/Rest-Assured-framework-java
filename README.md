# Rest-Assured-framework-java
This is basic frmework here tried here.Tried to retrive fetch data from different types of requests get,post,patch.

#Tools  and Frameowrk Used: Eclipse, Maven ,TestNG, Extent Report ,Rest assured libarbries

#Understanding of framework
• In main folder created diffrent packeges such as 
1.POJO- In this package For serialization of one post method.
2.API Verification :In  this  package some  common verification methods are placed  like response key,response status code,response time. 
3.API Configuration:In this package created classes such as API paths:hre API endpoints are placed and 2nd class is Header configuration in which Commmon headers are placed. 
4.Api builder: IN this packages post Api data is stored.
 5.Utils p- here file and env class is there and its logic then Extent Report Listner class got genreation reports and logs . then another class is jab=vautils to add the random data for post requests, then HMac class for sceurity purpose then also parsing dyncic data with nested loops  involving complex object and array.
 
•In test folder
1.Base test package:base url is setup with env and also extender the Extentreport class for logging purpose. 
2.2.Employee Info: here created a get API class and post Api class here passing random data also specifica satat sets with some logic also  created package for deserialization .
Created 3 data files to save the data  regarding particular environment  like dev, Qa,Staging
To run the partitular class right click :Run configuration select a particular package  adn test then in vm arguments pass -Denv=dev or qa whichever nee to test
