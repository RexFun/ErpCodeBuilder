Ext.ns('Epo.Erp.${model.moduleName}.View');
Epo.Erp.${model.moduleName}.View.Bottom = Ext.extend(Ext.form.FormPanel, {
	id : '${model.moduleName}ViewBottom',
	labelAlign:'right',
	frame : true,
	border : false,
	// 初始化
	initComponent : function() {
		this.setItemsDone();
		Epo.Erp.${model.moduleName}.View.Bottom.superclass.initComponent.call(this);
	},
	//创建面板底部控件
	setItemsDone : function() {
		this.selectedOrders = new Ext.form.DisplayField({fieldLabel:'选中单数',width:100,labelStyle:'text-align:right',style:'padding-top:3px;'});
		this.items = [{
			layout : 'table',
			border : false,
			layoutConfig : {columns:4},
			items : [
				{layout:'form',border:false,items:[this.selectedOrders]}
			]
		}];
	}
});
