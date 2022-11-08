<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>${title}</title>

</head>

<body align="center"><h1>${title}</h1>
<form name="send" id="sd" method="post" action="/">
    <div class="container" >
        <table align="center" style="width: 500px">
            <thead>
            <tr>
                <th>รหัสหม่าล่า</th>
                <th>ชื่อหม่าล่า</th>
                <th>ราคาหม่าล่า</th>
                <th>จำนวน</th>


            </tr>

            </thead>
            <tbody><c:forEach var="mala" items="${mala}">
                <tr>
                    <td><a href="${mala.malaID}/viewmala">${mala.malaID}</a></td>
                    <td>${mala.malaname}</td>
                    <td>${mala.mprice} <input type="hidden" name="price" value="${mala.mprice}"></td>

                    <td><input type="text" name="qty" maxlength="2" > </td>


                </tr>
            </c:forEach>

            </tbody>
        </table>
        //////////////////////////////////////////////////////////////////////////////////////////
        <h1>เบียร์-รายการ</h1>
        <table align="center"  style="width: 500px">
            <thead>
            <tr>
                <th>รหัสสินค้า</th>
                <th>ชื่อสินค้า</th>
                <th>ราคา</th>
                <th>จำนวน</th>
            </tr>
            </thead>
            <tbody><c:forEach var="beverage" items="${beverage}">
                <tr>
                    <td><a href="${beverage.beverageID}/viewbev">${beverage.beverageID}</a></td>
                    <td>${beverage.beverageName}</td>
                    <td>${beverage.bprice}<input type="hidden" name="price2" value="${beverage.bprice}"></td>

                    <td><input type="text" name="qty2" maxlength="2" > </td>
                </tr>
            </c:forEach></tbody>
        </table>


        ////////////////////////////////////////////////////////////////////////////////
        <table align="center">
            <tr>
                <td colspan="4" style="text-align: center">ราคาสินค้า</td>
            </tr>

            <tr>
                <td colspan="4" style="text-align: center">หม่าล่า
                    <input type="text"  id="sum" value="0" >
                </td>
            </tr>
            <tr>
                <td colspan="4" style="text-align: center">เบียร์
                    <input type="text"  id="sum2" value="0" >
                </td>

            </tr>
            <tr>
                <td>ราคารวม
                    <input type="text" id="total" name="total" value="0">
                </td>
            </tr>
            <tr>
                <td colspan="4" style="text-align: center">เลขโต๊ะ
                    <input type="text" id="desk" name="desk" value="">
                </td>
            </tr>

            <tr>
                <td colspan="4" style="text-align: center"><input type="button"  onclick="cal()" value=คำนวณ></td>
            </tr>
            <tr>
                <td colspan="4" style="text-align: center">

                  <button type="submit" id="sub" name="sub">เช็คบิล</button>



                </td>
            </tr>
        </table>

    </div>
</form>


</body>
<script>
    function cal(){
        let price=document.getElementsByName("price")
        let qty=document.getElementsByName("qty")
        let sum=0;
        for(var i=0;i<price.length;i++){
            if(qty[i].value){

                console.log('price='+price[i].value);
                console.log('qty='+qty[i].value);
                sum+=(price[i].value*qty[i].value)

            }
        }
        console.log('sum='+sum);
        document.getElementById("sum").value=sum+'';
        //----------------2
        let price2=document.getElementsByName("price2")
        let qty2=document.getElementsByName("qty2")
        let sum2=0;
        for(var i=0;i<price2.length;i++){
            if(qty2[i].value){

                console.log('price='+price2[i].value);
                console.log('qty='+qty2[i].value);
                sum2+=(price2[i].value*qty2[i].value)

            }
        }
        console.log('sum='+sum2);
        document.getElementById("sum2").value=sum2+'';

        document.getElementById("total").value=sum+sum2;
    }
</script>
</html>