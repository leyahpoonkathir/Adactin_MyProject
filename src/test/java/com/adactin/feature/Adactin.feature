Feature: Hotel Booking In Adactin Application

#Background:
#Given user Launch The Application
@Somketest
Scenario Outline: Login Functionality
Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click On The Login Button And Is Navigate To The Search Hotel Page
Examples:
|Username|Password|
|kathir|123|
|priya|345|
|leyahpoonkathir|123456789|
@Somketest
Scenario: Search Hotel Functionality
When user Select The Location In Location Field
And user Select The Hotels In Hotel Field
And user Select The RoomType In RoomType Field
And user Select The NumberOfRoom In NumberOfRoom Field
And user Enter The CheckInDate In CheckInDate Field
And user Enter The CheckOutDate In CheckOutDate Field
And user Select The AdultsPerRoom In AdultsPerRoom Field
And user Select The ChildrenPerRoom In ChildrenPerRoom Field
Then user Click On The Search Button And Is Navigate To The Select Hotel Page
@Sanitytest
Scenario: Select Hotel Functionality
When Click On The Radio Button1
#And Click On The Radio Button2
#And Click On The Radio Button3
#And Click On The Radio Button4
Then user Click On The Continue Button And Is Navigate To The Book Hotel Page

Scenario: Book Hotel Functionality
When user Enter The FirstName In FirstName Field
And user Enter The LastName In LastName Field
And user Enter The BillingAddress In BillingAddress Field
And user Enter The CreditCardNumber In CreditCardNumber Field
And user Select The CreditCardType In CreditCardType Field
#And user Select The ExpiredDate In ExpiredDate Field
And user Select The Month In Month Field
And user Select The Year In Year Field
And user Enter The CVVNumber In CVVNumber Field
Then user Click The BookNow Button And Is Navigate To The Booking Conformation Page

Scenario: Booking Conformation Hotel Functionality
Then user Click The SearchHotel Button 

#Scenario: LogOut Functionality
#Then user Click The LogOut Button 