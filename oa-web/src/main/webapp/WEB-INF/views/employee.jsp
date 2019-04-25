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
						<span class="col-lg-8" style="padding-left:888px"><button type="button"
								class="btn btn-outline btn-primary">新增</button>
							<button type="button" class="btn btn-outline btn-primary">修改</button>
						<span>
					</div>
					<hr/>
					<table class="col-lg-12" border="1">
						<thead style="font-size: 18;font-weight: bold">
								<td align="center"><input type="radio" class="employee_id" /></td>
								<td align="center">姓名</td>
								<td align="center">年龄</td>
								<td align="center">电话</td>
								<td align="center">邮箱</td>
								<td align="center">学历</td>
								<td align="center">描述</td>
						</thead>
						<tbody id="tbodyId">
							<c:forEach items="${list}" var="employee">
								<tr>
									<td align="center"><input type="radio" class="employee_id" value="${employee.id}" /></td>
									<td align="center">${employee.name}</td>
									<td align="center">${employee.age}</td>
									<td align="center">${employee.phone}</td>
									<td align="center">${employee.email}</td>
									<td align="center">${employee.study}</td>
									<td align="center">${employee.description}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
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
