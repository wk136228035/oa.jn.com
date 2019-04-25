<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="css/plugins/iCheck/custom.css" rel="stylesheet">
<link
	href="css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css"
	rel="stylesheet">

<!-- Ladda style -->
<link href="css/plugins/ladda/ladda-themeless.min.css" rel="stylesheet">

<!-- datepicker-->
<link href="css/plugins/datapicker/datepicker3.css" rel="stylesheet">
<link href="css/plugins/datapicker/" rel="stylesheet">

<style>
.form-table {
	table-layout: fixed;
	border-collapse: collapse;
}

.form-table tr {
	height: 40px;
	line-height: 40px;
}

.form-table tr td {
	border: 2px solid #888;
	text-align: center;
}

.form-table tr td label {
	margin: 0px;
}

.form-table tr td .form-control {
	margin: 0px;
}
</style>
<div class="ibox">
	<div class="ibox-content">
		<div class="form-group row">
			<div class="col-11">
				<div class="btn-group">
					<button data-toggle="dropdown"
						class="btn btn-primary btn-sm dropdown-toggle">分类</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="#">全部</a></li>
						<li><a class="dropdown-item" href="#">进行中</a></li>
						<li><a class="dropdown-item" href="#">办结</a></li>
					</ul>
				</div>

				<div class="btn-group">
					<button data-toggle="dropdown"
						class="btn btn-primary btn-sm dropdown-toggle">排序</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="#">全部</a></li>
						<li><a class="dropdown-item" href="#">进行中</a></li>
						<li><a class="dropdown-item" href="#">办结</a></li>
					</ul>
				</div>

				<div class="btn-group">
					<button data-toggle="dropdown"
						class="btn btn-primary btn-sm dropdown-toggle">筛选</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="#">全部</a></li>
						<li><a class="dropdown-item" href="#">进行中</a></li>
						<li><a class="dropdown-item" href="#">办结</a></li>
					</ul>
				</div>
			</div>
			<div class="col-1">
				<div class="btn-group">
					<button data-toggle="dropdown"
						class="btn btn-primary btn-sm dropdown-toggle">申请</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" data-toggle='modal'
							data-target='#absence' href="#">请假</a></li>
						<li><a class="dropdown-item" href="#">加班</a></li>
						<li><a class="dropdown-item" href="#">...</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="form-group  row">
			<div class="col-12">
				<div class="i-checks">
					<label> <input type="checkbox" value=""> <i></i>
						选项一
					</label>
				</div>
			</div>
		</div>
		<div class="">
			<div class="box-body table-responsive no-padding">
				<table class="table table-hover">
					<thead>
						<tr>
							<th width="5%"></th>
							<th width="75%"></th>
							<th width="10%"></th>
							<th width="10%"></th>
						</tr>
					</thead>

					<tbody id="tbodyId">
						<tr>
							<!--<td colspan="8">数据正在加载中...</td>-->
							<td>1.</td>
							<td>我要请假</td>
							<td>审批中</td>
							<td>zzq</td>
						</tr>
						<tr>
							<!--<td colspan="8">数据正在加载中...</td>-->
							<td>a</td>
							<td>a</td>
							<td>a</td>
							<td>a</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div id="pageId" class="box-footer clearfix"></div>
	</div>
</div>

<div class="modal inmodal" id="absence" tabindex="-1" role="dialog"
	aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content animated bounceInRight">
			<div class="modal-body">
				<form>
					<div class="form-group  row">
						<h2>请假申请</h2>
					</div>
					<div class="form-group  row">
						<table class="form-table col-sm-12">
							<tr>
								<td colspan="3"><input type="text" class="form-control"
									placeholder="请输入标题..." value="请假申请单"></td>
							</tr>

							<tr>
								<td><label>申请人:</label> zzq</td>
								<td><label>部门:</label> 开发部</td>
								<td><label>提交时间:</label> 2019-4-24</td>
							</tr>

							<tr>
								<td><label>请假类型</label></td>
								<td colspan="2"><select class="form-control m-b"
									name="account">
										<option>选项 1</option>
										<option>选项 2</option>
										<option>选项 3</option>
										<option>选项 4</option>
								</select></td>
							</tr>

							<tr>
								<td><label>请假时间</label></td>
								<td colspan="2">
									<div class="form-group" id="data_5">
										<label class="font-normal">范围选择</label>
										<div class="input-daterange input-group" id="datepicker">
											<input type="text" class="form-control-sm form-control"
												name="start"> <span class="input-group-addon">至</span>
											<input type="text" class="form-control-sm form-control"
												name="end">
										</div>
									</div>
								</td>
							</tr>

							<tr>
								<td><label>请假天数</label></td>

								<td colspan="2"><input type="number" class="form-control"
									placeholder="请输入天数" value="1" min="0.5" step="0.5"></td>
							</tr>

							<tr>
								<td><label>请假原因</label></td>

								<td colspan="2"><textarea class="form-control" rows="6"
										style="resize: none;"></textarea></td>
							</tr>
						</table>
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

<!-- iCheck -->
<script src="js/plugins/iCheck/icheck.min.js"></script>
<script>
            $(document).ready(function () {
                $('.i-checks').iCheck({
                    checkboxClass: 'icheckbox_square-green',
                    radioClass: 'iradio_square-green',
                });
            });
    </script>

<!-- Ladda -->
<script src="js/plugins/ladda/spin.min.js"></script>
<script src="js/plugins/ladda/ladda.min.js"></script>
<script src="js/plugins/ladda/ladda.jquery.min.js"></script>

<!-- Data picker -->
<script src="js/plugins/datapicker/bootstrap-datepicker.js"></script>
<script
	src="js/plugins/datapicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script>
        $(function () {
            var l = $('.submit').ladda();

            l.click(function () {
                // Start loading
                l.ladda('start');

                // Timeout example
                // Do something in backend and then stop ladda
                setTimeout(function () {
                    l.ladda('stop');
                    $("#absence").modal("hide");
                }, 12000)
            });

            $('#data_5 .input-daterange').datepicker({
                
                keyboardNavigation: false,
                forceParse: false,
                autoclose: true,
                language:"zh-CN",
                todayBtn:true,
                todayHighlight:true,
                defaultViewDate:"today"
            });
        });
    </script>