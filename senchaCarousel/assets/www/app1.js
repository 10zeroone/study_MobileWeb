Ext.application({
	name:'MyApp',
	launch:function(){
		
		var carousel = Ext.create('Ext.Carousel', {
			direction:'vertical',
			//direction:'horizontal',
			indicator:true,
			items:[
			       	{
			       		title:'Tab1',
			       		html:'<div align=center><img src="Chrysanthemum.jpg" width=200 height=150><br><br>Chrysanthemum/div>'
			       	},
			       	{
			       		title:'Tab1',
			       		html:'<div align=center><img src="Hydrangeas.jpg" width=200 height=150><br><br>Hydrangeas</div>'
			       	},
			       	{
			       		title:'Tab1',
			       		html:'<div align=center><img src="Tulips.jpg" width=200 height=150><br><br>Tulips</div>'
			       	}
			       ]
		});
		
		var rootPanel=Ext.create('Ext.Panel', {
			fullscreen:true,
			layout:{type:'vbox', align:'stretch', pack:'center'},
			defaults:{
				flex:1
			},
			items:[carousel]
		});
	}
});