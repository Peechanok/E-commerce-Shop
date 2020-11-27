# E-Commerce System
Store Module  กลุ่ม หลอดไฟ

**รายชื่อสมาชิก**
1. 61070067 ทิวัตถ์ ทิพย์เลข
2. 61070069 ธนโชติ จิรกิตติ์สกุล
3. 61070146 พีชนก ชูสมบัติ
4. 61070244 สิริลดา สอนสมบูรณ
5. 61070267 อัมรา ดงหลง
6. 61070346 ลลิตา สอาดเหลือ


##User interface
[https://peechanok.github.io/Group-Lamp-SOP/](https://peechanok.github.io/Group-Lamp-SOP/)<br><br>

**หมายเหตุ:** 1.ยังไม่ได้ลงรายละเอียดนะ

## Store Services
-   สมัครสมาชิกลูกค้า (SignUp)
-   เข้าสู่ระบบ (Login)
-   ลบบัญชีผู้ใช้ (Delete)
-   แก้ไขข้อมูลบัญชี เช่น ชื่อ, ที่อยู่, รหัสผ่าน (Edit)
-   ลงข้อมูลสินค้าที่ขาย (Items for sale)
-   ดูยอดการขาย (total sales)
## Diagram Shop Microservice 
![Image](https://imgur.com/EMCQ2oE)

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
      


