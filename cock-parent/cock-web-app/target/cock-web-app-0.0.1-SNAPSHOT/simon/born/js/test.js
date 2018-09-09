var app = new Vue({
  el: '#simonapp',
  data: {
    message: 'Hello Simon!',
    mydata: {'name':'sihualong'}
  },
  methods: {
  	testFunc:function(){
  		console.log('==========进入testFunc（）==============')
  		$.ajax({
  					url     : '/simon/webapp/web/simonBornInfo/query',
  					data    : JSON.stringify(this.mydata),
            dataType: 'JSON',//要求返回的数据格式为Json
            type    : 'POST',
            contentType:'application/json;charset=UTF-8',
            success : function(data){
            	console.log('==========testFunc()成功============');
            
            	console.log(data.name);
            },
            error   : function(xhr,textStatus){
            	console.log('==========testFunc()错误============');
            	console.log(xhr)
        			console.log(textStatus)
            }
  		})
  	}
  
  }
})