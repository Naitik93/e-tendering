<%-- 
    Document   : fill_tender
    Created on : 23 Apr, 2015, 6:55:11 PM
    Author     : Naitik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="header_logged.jsp" %>

 
<div id="container">
    <form method="post" action="multiple_file" enctype="multipart/form-data">
    <div>
    <fieldset>
		<legend align="center">FILL TENDER</legend>
				
                <div class="form">
	
                                        <label>NAME OF TENDER</label>
					<input type="text" name="name"  placeholder="Enter Tender Name" required="required"/> 
							
					<label>DEPARTMENT</label>
					<input type="text" name="dept" id="panno" placeholder="Enter Department" required="required"/> 
                                        
                                        <label>NET AMOUNT OF TENDER</label>
					<input type="text" name="amount"  placeholder="Enter Tender Name" required="required"/> 
					
                                        <label>TENDER FEE PAID TYPE</label>
                                        <select name="fee">
                                            <option>Demand Draft (DD)</option>
                                            <option>Cheque</option>                                            
                                        </select>
                                        
                                        <label>TENDER FEE</label>
					<input type="file" name="tfee" id="itfile" required="required"/> 
                                        
                                        
					<label>SOLVENCY</label>
					<input type="file" name="sol" id="estdate"required="required"/>
                                        
                                        <label>EARNEST MONEY DEPOSIT OF TENDER</label>
					<input type="file" name="emd" id="itfile" required="required"/> 
                                                                                                                        
                                        <label>FILLED TENDER DETAILS</label>
					<input type="file" name="tdetail" id="itfile" required="required"/> 
                                        
                                        <label>VAT CERTIFICATE</label>
					<input type="file" name="vat" id="itfile" required="required"/> 
                                        
                                        <input class="submit" type="submit" name="submit_third" id="submit_third" value="" />
                                        
                                            </div>

	</fieldset>
	</div>
    </form>
        </div>


<%@include file="footer.jsp" %>