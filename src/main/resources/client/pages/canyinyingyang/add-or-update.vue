<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0 0 0 0","position":"relative","background":"#ffffff","height":"100%"}'>
		<form :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","background":"#ffffff","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px 0px 2rpx 0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">菜品名称</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="caipinmingchengChange" :value="caipinmingchengIndex"  :range="caipinmingchengOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666666"}' class="uni-input">{{caipinmingchengOptions[caipinmingchengIndex]}}</view>
				</picker>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px 0px 2rpx 0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">菜品分类</view>
				<input :style='{"border":"0px solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"8rpx","flex":"1","background":"#ffffff00","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.caipinfenlei" v-model="ruleForm.caipinfenlei" placeholder="菜品分类"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px 0px 2rpx 0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="tupianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.tupian" :src="baseUrl+ruleForm.tupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px 0px 2rpx 0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">卡路里(cal)</view>
				<input :style='{"border":"0px solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"8rpx","flex":"1","background":"#ffffff00","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.kaluli" v-model="ruleForm.kaluli" placeholder="卡路里(cal)"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px 0px 2rpx 0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">碳水(100g)</view>
				<input :style='{"border":"0px solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"8rpx","flex":"1","background":"#ffffff00","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.tanshui" v-model="ruleForm.tanshui" placeholder="碳水(100g)"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px 0px 2rpx 0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">蛋白质(100g)</view>
				<input :style='{"border":"0px solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"8rpx","flex":"1","background":"#ffffff00","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.danbaizhi" v-model="ruleForm.danbaizhi" placeholder="蛋白质(100g)"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px 0px 2rpx 0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">脂肪(100g)</view>
				<input :style='{"border":"0px solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"8rpx","flex":"1","background":"#ffffff00","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.zhifang" v-model="ruleForm.zhifang" placeholder="脂肪(100g)"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px 0px 2rpx 0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">营养素(100g)</view>
				<view :style='{"padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#000000","flex":"1"}' class="right-input">
					{{ruleForm.yingyangsu}}
				</view>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0px 0px 2rpx 0px","background":"none","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">营养级别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="yingyangjibieChange" :value="yingyangjibieIndex"  :range="yingyangjibieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666666"}' class="uni-input">{{ruleForm.yingyangjibie?ruleForm.yingyangjibie:"请选择营养级别"}}</view>
				</picker>
			</view>
			
			<!-- 否 -->
 

			
			
			<view :style='{"width":"100%","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0px solid #eeeeee","padding":"0 0 0 0","margin":"0 4% 0 0","color":"#fff","borderRadius":"60rpx","background":"#d84fa9","width":"30%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				caipinmingcheng: '',
				caipinfenlei: '',
				tupian: '',
				kaluli: '',
				tanshui: '',
				danbaizhi: '',
				zhifang: '',
				yingyangsu: '',
				yingyangjibie: '',
				},
				caipinmingchengOptions: [],
				caipinmingchengIndex: 0,
				yingyangjibieOptions: [],
				yingyangjibieIndex: 0,
				// 登录用户信息
				user: {},
                ro:{
                   caipinmingcheng : false,
                   caipinfenlei : false,
                   tupian : false,
                   kaluli : false,
                   tanshui : false,
                   danbaizhi : false,
                   zhifang : false,
                   yingyangsu : false,
                   yingyangjibie : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect
		},
		watch:{
			"ruleForm":{
				handler:function (){
					let c = this.ruleForm
					let a0 = Number(c.tanshui)+Number(c.danbaizhi)+Number(c.zhifang)
					this.ruleForm.yingyangsu = a0.toFixed(2)
				},
				deep:true
			}
		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 下2
			res = await this.$api.option(`canyinxinxi`,`caipinmingcheng`,{});
			this.caipinmingchengOptions = res.data;
			// 下拉框
			res = await this.$api.option(`yingyangjibie`,`yingyangjibie`,{});
			this.yingyangjibieOptions = res.data;
            this.yingyangjibieOptions.unshift("请选择营养级别");

			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`canyinyingyang`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='caipinmingcheng'){
					this.ruleForm.caipinmingcheng = obj[o];
					this.ro.caipinmingcheng = true;
					continue;
					}
					if(o=='caipinfenlei'){
					this.ruleForm.caipinfenlei = obj[o];
					this.ro.caipinfenlei = true;
					continue;
					}
					if(o=='tupian'){
					this.ruleForm.tupian = obj[o].split(",")[0];
					this.ro.tupian = true;
					continue;
					}
					if(o=='kaluli'){
					this.ruleForm.kaluli = obj[o];
					this.ro.kaluli = true;
					continue;
					}
					if(o=='tanshui'){
					this.ruleForm.tanshui = obj[o];
					this.ro.tanshui = true;
					continue;
					}
					if(o=='danbaizhi'){
					this.ruleForm.danbaizhi = obj[o];
					this.ro.danbaizhi = true;
					continue;
					}
					if(o=='zhifang'){
					this.ruleForm.zhifang = obj[o];
					this.ro.zhifang = true;
					continue;
					}
					if(o=='yingyangsu'){
					this.ruleForm.yingyangsu = obj[o];
					this.ro.yingyangsu = true;
					continue;
					}
					if(o=='yingyangjibie'){
					this.ruleForm.yingyangjibie = obj[o];
					this.ro.yingyangjibie = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					document.querySelectorAll('.radioText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.radioTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #999999","borderRadius":"0","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #5fb959","borderRadius":"0","color":"#fff","background":"#5fb959"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #999999","borderRadius":"0","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #5fb959","color":"#fff","borderRadius":"0","background":"#5fb959"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
				})
			},
			// 下二随
			async caipinmingchengChange (e) {
				this.caipinmingchengIndex = e.target.value
				this.ruleForm.caipinmingcheng = this.caipinmingchengOptions[this.caipinmingchengIndex]
				let res = await this.$api.follow(`canyinxinxi`, `caipinmingcheng`,{
					columnValue: this.ruleForm.caipinmingcheng
				});
				if(res.data.caipinfenlei){
					this.ruleForm.caipinfenlei = res.data.caipinfenlei
				}
			},

			// 多级联动参数


			// 下拉变化
			yingyangjibieChange(e) {
				this.yingyangjibieIndex = e.target.value
				this.ruleForm.yingyangjibie = this.yingyangjibieOptions[this.yingyangjibieIndex]
			},

			tupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tupian = 'file/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {



















//跨表计算判断
				var obj;
				if((!this.ruleForm.caipinmingcheng)){
					this.$utils.msg(`菜品名称不能为空`);
					return
				}
				if((!this.ruleForm.caipinfenlei)){
					this.$utils.msg(`菜品分类不能为空`);
					return
				}
				if(this.ruleForm.kaluli&&(!this.$validate.isNumber(this.ruleForm.kaluli))){
					this.$utils.msg(`卡路里(cal)应输入数字`);
					return
				}
				if(this.ruleForm.tanshui&&(!this.$validate.isNumber(this.ruleForm.tanshui))){
					this.$utils.msg(`碳水(100g)应输入数字`);
					return
				}
				if(this.ruleForm.danbaizhi&&(!this.$validate.isNumber(this.ruleForm.danbaizhi))){
					this.$utils.msg(`蛋白质(100g)应输入数字`);
					return
				}
				if(this.ruleForm.zhifang&&(!this.$validate.isNumber(this.ruleForm.zhifang))){
					this.$utils.msg(`脂肪(100g)应输入数字`);
					return
				}
				if(this.ruleForm.yingyangsu&&(!this.$validate.isNumber(this.ruleForm.yingyangsu))){
					this.$utils.msg(`营养素(100g)应输入数字`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
                    uni.setStorageSync('crossCleanType',true);
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`canyinyingyang`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`canyinyingyang`, this.ruleForm);
						}else{
							await this.$api.add(`canyinyingyang`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`canyinyingyang`, this.ruleForm);
					}else{
						await this.$api.add(`canyinyingyang`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
