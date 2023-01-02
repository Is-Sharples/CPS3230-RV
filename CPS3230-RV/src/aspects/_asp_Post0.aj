package aspects;

import larva.*;
public aspect _asp_Post0 {

public static Object lock = new Object();

boolean initialized = false;

after():(staticinitialization(*)){
if (!initialized){
	initialized = true;
	_cls_Post0.initialize();
}
}
before ( boolean value) : (call(* *.PostApiCall(..)) && args(value) && !cflow(adviceexecution()) && !cflow(within(larva.*))  && !(within(larva.*))) {

synchronized(_asp_Post0.lock){

_cls_Post0 _cls_inst = _cls_Post0._get_cls_Post0_inst();
_cls_inst.value = value;
_cls_inst._call(thisJoinPoint.getSignature().toString(), 50/*goodApiPost*/);
_cls_inst._call_all_filtered(thisJoinPoint.getSignature().toString(), 50/*goodApiPost*/);
}
}
}