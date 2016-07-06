////脸部编辑操作模块
//脸部编辑
function faceChange(i) {
    if (i < 10) {
        expressDataParse(face,"facePart",faceData["face2000"+i].frontSide,true);
    } else {
        expressDataParse(face,"facePart",faceData["face200"+i].frontSide,true);
    }
	if(faceTag.color!=""){
		roleA.selectAll(".faceColor").attr("fill",faceTag.color);
	}
}
//头发编辑
function hairChange(i) {
	hairDataParse(frontHair,middleHair,backHair,"hairPart",hairData["hair"+i].frontSide,true);
	if(hairTag.color!=""){
		roleA.selectAll(".hairColor").attr("fill",hairTag.color);
	}
}
//眼睛编辑
function eyeChange(i) {
	expressDataParse(eye,"eyePart",eyeData["eye"+i].frontSide,true);
}
//鼻子变换
function noseChange(i){
    if (i < 10) {
        expressDataParse(nose,"nosePart",noseData["nose2000"+i].frontSide,true);
    } else {
        expressDataParse(nose,"nosePart",noseData["nose200"+i].frontSide,true);
    }
}
//嘴部编辑
function mouthChange(i){
	expressDataParse(mouth,"mouthPart",mouthData["mouth"+i].frontSide,true);
}