package aspects;

import larva.*;
public aspect _asp_Rv0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_Rv0.initialize();
}
}
before ( String userId) : (call(* *.DeleteApiCall(..)) && args(userId) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_Rv0.lock){

_cls_Rv0 _cls_inst = _cls_Rv0._get_cls_Rv0_inst();
_cls_inst.userId = userId;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 28/*goodDelete*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 28/*goodDelete*/);
}
}
before ( boolean val) : (call(* *.LoginFunction(..)) && args(val) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_Rv0.lock){

_cls_Rv0 _cls_inst = _cls_Rv0._get_cls_Rv0_inst();
_cls_inst.val = val;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 24/*goodLogin*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 24/*goodLogin*/);
}
}
before ( boolean value) : (call(* *.PostApiCall(..)) && args(value) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_Rv0.lock){

_cls_Rv0 _cls_inst = _cls_Rv0._get_cls_Rv0_inst();
_cls_inst.value = value;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 26/*goodApiPost*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 26/*goodApiPost*/);
}
}
}