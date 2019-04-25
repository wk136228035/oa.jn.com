<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="wrapper wrapper-content animated fadeInRight">
	<div class="row">
		<div class="col-lg-12">
			<div class="ibox ">
				<div class="ibox-content col-lg-12">
					<div class="col-lg-12">
						<div class="col-lg-8"></div>
						<span class="col-lg-8" style="padding-left:833px">
							<button type="button" class="btn btn-outline btn-primary">职位调动</button>
							<button type="button" class="btn btn-outline btn-danger">离岗调整</button>
						<span>
					</div>
					<hr/>
					<table class="col-lg-12" border="1">
						<thead style="font-size: 18;font-weight: bold">
								<td align="center"><input type="radio" class="record_id" /></td>
								<td align="center">员工</td>
								<td align="center">职位</td>
								<td align="center">状态</td>
								<td align="center">入职时间</td>
								<td align="center">离职时间</td>
						</thead>
						<tbody id="tbodyId">
							<c:forEach items="${recordList}" var="record">
								<tr>
									<td align="center"><input type="radio" class="record_id" value="${record.id}" /></td>
									<td align="center">${record.employeeId}</td>
									<td align="center">${record.employeeJob}</td>
									<td align="center"><input type="hidden" value="((${record.employeeStatus}==1)?'在职':'离职')"></td>
									<td align="center"><fmt:formatDate type="both" 
            								value="${record.employeeCreated}" /></td>
									<td align="center"><fmt:formatDate type="both" 
            								value="${record.employeeUpdated}" /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="modal inmodal" id="absence" tabindex="-1" role="dialog"
	aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content animated bounceInRight">
			<div class="modal-body">
				<form>
					<div class="form-group  row">
						<h2 class="h2-title">员工</h2>
					</div>
					<div class="form-group  row">
						
							
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button class="ladda-button btn btn-primary submit"
					data-style="expand-right">提交</button>
				<button type="button" class="btn btn-white btnClose"
					data-dismiss="modal">关闭</button>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		status();
	})
	
	function status(){
		$(".status").each(function(){
			var status = $(this).text();
			$(this).text((status==1)?"在职":"离职");
		})
	}
</script>
