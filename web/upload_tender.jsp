<%@include file="header_logged.jsp" %>

 
<div id="container">
    <form method="post" action="FileUploadServlet" enctype="multipart/form-data">
    <div>
    <fieldset>
		<legend align="center">UPLOAD TENDER</legend>
				
                <div class="form">
	
                                        <label>NAME</label>
					<input type="text" name="name"  placeholder="Enter Tender Name" required="required"/> 
							
					<label>DEPARTMENT</label>
					<input type="text" name="dept" id="panno" placeholder="Enter Department" required="required"/> 
							
					<label>START DATE</label>
					<input type="date" name="stdate" id="estdate"required="required"/>
                                        
                                        <label>TENDER</label>
					<input type="file" name="file" id="itfile" required="required"/> 
                                        
                                        <input class="submit" type="submit" name="submit_third" id="submit_third" value="" />
                                        
                                            </div>

	</fieldset>
	</div>
    </form>
        </div>


<%@include file="footer.jsp" %>