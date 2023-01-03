# Business Otomation

## Genereal Condition and Appearance

**This automation system is a simple level project written to facilitate some functions of enterprises.**

----

<h3>The technologies used in this project:</h3>

<br>

<p align="left">
    &emsp; 
      <img alt="Java" src="https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/30px-Java_programming_language_logo.svg.png">
    </a> 
      <img alt="MySQL" src="https://www.vectorlogo.zone/logos/mysql/mysql-ar21.svg">
    </a> 
      <img alt="VCS" src="https://www.vectorlogo.zone/logos/git-scm/git-scm-ar21.svg">
    </a>
    &emsp;
</p>

----

**Clone this project this:**

```git

git clone https://github.com/ahmetpyrzklnc/business-otomation.git

````
----

***Security is everything!***

[![login.png](https://i.postimg.cc/D0qc60WF/login.png)](https://postimg.cc/p5L8X2Y1)

- If the user is registered in the database, the user name and password are first obtained and compared with the data from the database.

- Extra work has been done for the security of the password.

- If the password is correct, you will be directed to the main screen.

- If the password is incorrect, a message box is opened and a warning is given.

- If the user is not registered in the database, it is directed to the registration section by clicking the register button.

----
***Recording is indispensable!***

[![register.png](https://i.postimg.cc/g2wxb5DL/register.png)](https://postimg.cc/sMrjpTb3)

- The user's information is retrieved and sent to the database as a new record. 

- If the registration is successful, an information window opens on the screen.

- The user is directed to the login screen again.

----

***Home page***

[![homepage.png](https://i.postimg.cc/90M7RfGJ/homepage.png)](https://postimg.cc/Ppgx0TVw)

- Buttons for 4 different functions have been created on the home page.

- If the user wants to perform an action related to employees, the specified button redirects there

- If the user wants to make a transaction related to the warehouse, the specified button redirects there.

- If the user wants to make an operation related to the sellers, the specified button redirects there.

- If the user wants to perform a customer-related action, the specified button redirects there

- To exit the user information, the exit button is specified.

----

***Customer Screen***

[![customers.png](https://i.postimg.cc/tC6grPCF/customers.png)](https://postimg.cc/SJyqRn9K)

- Designed a simple interface with information about customers

*Functions:*


- ***Listing:*** Lists all customer data in the database in a table
- ***Register:***  Sends a new customer record to the database
- ***Uptade:*** Updates the existing record in the database
- ***Delete:*** Deletes the current record in the database
- ***Search:*** Scans the database and displays the desired record in the table

We summarised briefly.

----

***Stock Screen***

[![stock.png](https://i.postimg.cc/8cj7k0SY/stock.png)](https://postimg.cc/dZcs4nDR)

- A simple interface has been designed to easily learn the warehouse status.

*Functions:*


- ***Listing:*** Shows the warehouse status in the database in a simple table
- ***Register:***  Sends a new data entry to the storage data in the database.
- ***Uptade:*** We update the warehouse data in the database.
- ***Delete:*** Deletion is performed from the storage data in the database.
- ***Search:*** The search is performed from the repository data in the database

We summarised briefly.

----

***Distrubutor Screen***

[![distrubutor.png](https://i.postimg.cc/L8fN6y4h/distrubutor.png)](https://postimg.cc/zyznxFg1)

- Information about sellers is shared with the user in the form of a simple interface.

*Functions:*


- ***Listing:*** It shows the vendor data in the database as a table.
- ***Register:***  A new vendor record is sent to the database
- ***Uptade:*** The vendor data is updated in the database.
- ***Delete:*** The vendor data is deleted in the database.
- ***Search:*** Vendor data is searched in the database.

We summarised briefly.

----

***Employee Screen***

[![employee.png](https://i.postimg.cc/sX2YSKzY/employee.png)](https://postimg.cc/p9g5Mfpr)

- It is a screen for sharing data about employees with the user with a simple interface.

*Functions:*


- ***Listing:*** Employees in the database are listed in a table.
- ***Register:***  New data is added to the list of employees in the database.
- ***Uptade:*** Data is updated in the list of employees in the database.
- ***Delete:*** New data is deleted from the list of employees in the database.
- ***Search:***  A search is made in the list of employees in the database.

We summarised briefly.

---

# Database

**The data list is available here:**

***Login Database***
---

|login_id|login_name|login_surname|login_user|login_password|
|--------|----------|-------------|----------|--------------|
|1       |Ahmet     |Kılınç       |ahmtklnc_ |1234          |
|2       |Hasan     |Yılmaz       |hsnylmz_  |2345          |
|3       |Sefa      |Karakter     |sefakrktr |1234          |
|4       |Naz     |Sönmez       |nazlisnmz_|1234          |


---

***Customer Database***
---


|customer_id|customer_name|customer_lastname|
|-----------|-------------|-----------------|
|1          |Ahmet        |Kılınç           |
|2          |Nursena      |Kalaycı          |
|3          |Sefa         |Yiğit            |
|4          |Mustafa      |Kemal            |
|5          |Fatmanur     |Özyeğin          |
|6          |Damla        |Özdemir          |
|7          |Yağmur       |Bardakçı         |


---

***Stock Database***
---

|stock_amount_id|stock_amount_name|stock_amount_model|stock_amount_price|stock_amount_stock|
|---------------|-----------------|------------------|------------------|------------------|
|1              |Asus             |Laptop            |4000              |150               |
|2              |HP               |Laptop            |5000              |120               |
|3              |Samsung          |Telefon           |900               |340               |
|4              |SteelSeries      |Mouse             |500               |1200              |
|5              |AMD              |CPU               |790               |1000              |
|6              |İntel            |CPU               |1000              |2500              |
|7              |İntel            |CPU               |11                |230               |
|10             |SteelSeries      |Klavye            |100               |100               |
|11             |Asus             |Klavye            |109               |101               |
|13             |Deneme           |Klavye            |1101              |101               |
|14             |Deneme3          |Klavye            |1101              |101               |


---

***Distrubutor Database***
----

|distrubutor_id|distrubutor_name|distrubutor_city|distrubutor_gsm|
|--------------|----------------|----------------|---------------|
|1             |Akaydınlar      |İstanbul        |567            |
|2             |Kardeşler       |Ankara          |505            |
|3             |Bozgunlar       |Bitlis          |545            |
|4             |Koç             |Ankara          |515            |
|5             |Sabancı         |İzmir           |565            |
|6             |Phillip         |Ankara          |515            |
|7             |Morris          |Afyon           |525            |
|8             |TeknoTech       |Kütahya         |535            |
|9             |Yazgılılar      |Eskişehir       |545            |
|10            |Bardakçılar     |Antalya         |555            |
|11            |Güvenler        |Konya           |564            |

---

***Employee Database***
---

|employee_id|employee_name|employee_lastname|employee_departmant|employee_salary|
|-----------|-------------|-----------------|-------------------|---------------|
|1          |Aykut        |Yılmaz           |Hukuk              |5000           |
|2          |Nursena      |Yılmaz           |Yazılım            |7000           |
|3          |Melek        |Özdemir          |Yazılım            |7600           |
|4          |Fatma        |Girişken         |Yönetim            |7800           |
|5          |Sena         |Kalaycı          |Yönetim            |7900           |
|6          |Hasan        |Demir            |Hukuk              |6000           |
|7          |Salih        |Dursun           |Yazılım            |8000           |
|8          |Yağmur       |Kuru             |Yönetim            |1000           |
|9          |Damla        |Güner            |Elektronik         |7200           |
|11         |Ayşenur      |Yıldızdal        |Elektronik         |8000           |


---


<br>

- **Thank you for riding!**

<br>

<a href="mailto:ahmtklnc.software@gmail.com">You can reach me here!</a>

