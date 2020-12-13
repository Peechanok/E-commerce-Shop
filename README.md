# E-Commerce System - Shop
Shop Module  กลุ่ม หลอดไฟ

**รายชื่อสมาชิก**
1. 61070067 ทิวัตถ์ ทิพย์เลข Front-end
2. 61070069 ธนโชติ จิรกิตติ์สกุล Back-end
3. 61070146 พีชนก ชูสมบัติ   Project Manager , Back-end
4. 61070244 สิริลดา สอนสมบูรณ Front-end
5. 61070267 อัมรา ดงหลง Back-end 
6. 61070346 ลลิตา สอาดเหลือ Front-end

# Roles play
1. Project Manager หรือ ผู้จัดการโครงการ 
  คือผู้ที่ทำหน้าที่บริหารโครงการและงานต่างๆในโครงการ คิด วางแผน กำหนดงาน ในโครงการให้ชัดเจน และควบคุมให้ดำเนินไปตามเป้าหมาย เสร็จตรงตามเวลา ภายใต้ข้อกำหนดและขอบเขตที่เหมาะสม
2. Front-end สำหรับสาย Developer แล้วก็คือ หน้าบ้าน หรือจะเรียกให้ดูดีมีระดับก็คือ User Interface (UI)  ส่วนที่ทุกคนสามารถมองเห็นได้ของเว็บไซต์ หรือแอปพลิเคชัน ความสำคัญของ Front-end ส่วนนี้จะเป็นส่วนที่แสดงหน้าตาเว็บไซต์ให้ผู้ที่เข้ามาชม ได้เห็นถึงการออกแบบซึ่งจุดนี้จะเป็นจุดที่ดึงดูด และทำให้ผู้ที่เข้ามาดูในเว็บไซต์เราสนใจในสิ่งที่เรานำเสนอนั้นเอง เปรียบเอาง่ายๆ เสมือนหน้าร้านค้าของเรา ถ้าหน้าร้านค้าเราสวยดูดี สะอาด ลูกค้าก็อยากจะเข้า
3. Back-end สำหรับสาย Developer จะเรียกกันว่า หลังบ้าน เป็นส่วนของการทำงานเบื้องหลังจำพวก ฐานข้อมูล และโครงสร้างพื้นฐาน แต่ถ้ามองในสายงาน Developer แล้วก็ Back-end คือการจัดการฐานข้อมูล การจัดการโครงสร้างของเว็บไซต์ การเขียนโค้ดควบคุมการทำงาน การที่ใช้ภาษาในการเขียน ยกตัวอย่างเช่น PHP, JAVA,  C#, C++ เป็นต้น ความสำคัญของ Back-end มีความสำคัญต่อเว็บไซต์เป็นอย่างยิ่ง ไม่ว่าจะเป็นการจัดการข้อมูลสินค้า การจัดการข้อมูลผู้ใช้งาน การเขียนเนื้อหาบทความ และอีกมากมายหลายอย่าง

##User interface
[https://peechanok.github.io/Group-Lamp-SOP/](https://peechanok.github.io/Group-Lamp-SOP/)<br><br>


## Shop Services

-   เข้าสู่ระบบ (Login)
-   หน้าร้านขายสินค้า (Shop)
-   แก้ไขข้อมูลบัญชี เช่น ชื่อ, ที่อยู่, รหัสผ่าน (Edit)
-   ลงข้อมูลสินค้าที่ขาย (Items for sale)
-   ดูยอดการขาย (total sales)
## :wrench: API
- /createSales/ สร้างข้อมูลคนขาย
- /getSales/<:Sales_id> ดึงข้อมูลคนขายผ่าน id
- /getSalesAll ดึงข้อมูลคนขายในระบบทุกคน
- /deleteSales/<:Sales_id>  ลบข้อมูลคนขาย
- /createAddress/ สร้างที่อยู่ของคนขาย
- /getAddress/<:Sales_id> ดึงข้อมูลที่อยู่อยู่ของคนขาย
- /updateAddress/<:my_address_id> แก้ไขข้อมูลที่อยู่ที่ id นั้น
- /deleteAddress/<:my_address_id> ลบไขข้อมูลที่อยู่ที่ id นั้น
- /createShop/ สร้างร้านค้าของคนขาย
- /getShop/<:Sales_id> ดึงข้อมูลร้านค้าของคนขาย
- /updateShop/<:Shop_id> แก้ไขข้อมูลร้านค้าที่ id นั้น
- /deleteShop/<:Shop_id> ลบข้อมูลร้านค้า

## Database

![Image](https://imgur.com/o46Xwvd.jpg)

## Diagram Shop Microservice 
![Image](https://imgur.com/EMCQ2oE.jpg)

## Store Database (Logical Design)
![Image](https://imgur.com/AdDN4Q1.jpg)

**รายละเอียด**
1. บัญชีคนขาย (SALES) มีการเก็บข้อมูลดังนี้
    * รหัสของคนขาย (id)
    * ชื่อบัญชีผู้ใช้ (userName)
    * รหัสผ่าน (password)
    * ชื่อ (firstName)
    * นามสกุล (lastName)
    * อีเมลล์ (email)
    * ที่อยู่ (address)
    * วันที่สร้าง (dateCreated)
  
    
2. ที่อยู่ของผู้ใช้งาน (MY_ADDRESS)
   * ไอดี (my_address_id)
   * จังหวัด (province)
   * อำเภอ (district)
   * ตำบล (sub_district)
   * ถนน (road)
   * เลขที่ (number)
   * รหัสไปรษณีย์ (postal_code)

3. หมวดหมู่ ( Shop) มีการเก็บข้อมูลดังนี้
      * รหัสของหมวดหมู่ (id)
      * ชื่อร้านค้า (shopName)
      * คำอธิบาย (description)
      * ไอดีผู้ขาย (SALES_id)
      * ยอดขายรวม (total_sales)
      
##extention
 - ใช้ Moesif CORS ใน google chome


