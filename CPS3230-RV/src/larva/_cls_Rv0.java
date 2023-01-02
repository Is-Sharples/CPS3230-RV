package larva;


import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_Rv0 implements _callable{

public static PrintWriter pw; 
public static _cls_Rv0 root;

public static LinkedHashMap<_cls_Rv0,_cls_Rv0> _cls_Rv0_instances = new LinkedHashMap<_cls_Rv0,_cls_Rv0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\Drew\\workspace\\CPS3230-RV/src/output_Rv.txt");

root = new _cls_Rv0();
_cls_Rv0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_Rv0 parent; //to remain null - this class does not have a parent!
public static boolean val;
public static boolean value;
public static String userId;
int no_automata = 1;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_Rv0() {
}

public void initialisation() {
}

public static _cls_Rv0 _get_cls_Rv0_inst() { synchronized(_cls_Rv0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_Rv0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_Rv0_instances){
_performLogic_testing(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_Rv0[] a = new _cls_Rv0[1];
synchronized(_cls_Rv0_instances){
a = _cls_Rv0_instances.keySet().toArray(a);}
for (_cls_Rv0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_Rv0_instances){
_cls_Rv0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_testing = 29;

public void _performLogic_testing(String _info, int... _event) {

_cls_Rv0.pw.println("[testing]AUTOMATON::> testing("+") STATE::>"+ _string_testing(_state_id_testing, 0));
_cls_Rv0.pw.flush();

if (0==1){}
else if (_state_id_testing==26){
		if (1==0){}
		else if ((_occurredEvent(_event,26/*goodApiPost*/)) && (value ==true )){
		
		_state_id_testing = 26;//moving to state AlertScreen
		_goto_testing(_info);
		}
		else if ((_occurredEvent(_event,26/*goodApiPost*/)) && (value ==false )){
		
		_state_id_testing = 24;//moving to state invalidPost
		_goto_testing(_info);
		}
		else if ((_occurredEvent(_event,28/*goodDelete*/)) && (userId =="00de4d33-5d10-4151-ad8f-39dca960ddce")){
		
		_state_id_testing = 26;//moving to state AlertScreen
		_goto_testing(_info);
		}
		else if ((_occurredEvent(_event,28/*goodDelete*/)) && (userId !="00de4d33-5d10-4151-ad8f-39dca960ddce")){
		
		_state_id_testing = 25;//moving to state invalidDelete
		_goto_testing(_info);
		}
}
else if (_state_id_testing==29){
		if (1==0){}
		else if ((_occurredEvent(_event,24/*goodLogin*/)) && (val ==true )){
		
		_state_id_testing = 26;//moving to state AlertScreen
		_goto_testing(_info);
		}
		else if ((_occurredEvent(_event,24/*goodLogin*/)) && (val ==false )){
		
		_state_id_testing = 23;//moving to state invalidLogin
		_goto_testing(_info);
		}
}
}

public void _goto_testing(String _info){
_cls_Rv0.pw.println("[testing]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_testing(_state_id_testing, 1));
_cls_Rv0.pw.flush();
}

public String _string_testing(int _state_id, int _mode){
switch(_state_id){
case 27: if (_mode == 0) return "PostRequest"; else return "PostRequest";
case 25: if (_mode == 0) return "invalidDelete"; else return "!!!SYSTEM REACHED BAD STATE!!! invalidDelete "+new _BadStateExceptionRv().toString()+" ";
case 26: if (_mode == 0) return "AlertScreen"; else return "AlertScreen";
case 24: if (_mode == 0) return "invalidPost"; else return "!!!SYSTEM REACHED BAD STATE!!! invalidPost "+new _BadStateExceptionRv().toString()+" ";
case 23: if (_mode == 0) return "invalidLogin"; else return "!!!SYSTEM REACHED BAD STATE!!! invalidLogin "+new _BadStateExceptionRv().toString()+" ";
case 28: if (_mode == 0) return "DeleteRequest"; else return "DeleteRequest";
case 29: if (_mode == 0) return "LoginPage"; else return "LoginPage";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}