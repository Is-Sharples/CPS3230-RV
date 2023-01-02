package larva;


import java.util.LinkedHashMap;
import java.io.PrintWriter;

public class _cls_Post0 implements _callable{

public static PrintWriter pw; 
public static _cls_Post0 root;

public static LinkedHashMap<_cls_Post0,_cls_Post0> _cls_Post0_instances = new LinkedHashMap<_cls_Post0,_cls_Post0>();
static{
try{
RunningClock.start();
pw = new PrintWriter("C:\\Users\\Drew\\workspace\\CPS3230-RV/src/output_Post.txt");

root = new _cls_Post0();
_cls_Post0_instances.put(root, root);
  root.initialisation();
}catch(Exception ex)
{ex.printStackTrace();}
}

_cls_Post0 parent; //to remain null - this class does not have a parent!
public static boolean value;
int no_automata = 1;

public static void initialize(){}
//inheritance could not be used because of the automatic call to super()
//when the constructor is called...we need to keep the SAME parent if this exists!

public _cls_Post0() {
}

public void initialisation() {
}

public static _cls_Post0 _get_cls_Post0_inst() { synchronized(_cls_Post0_instances){
 return root;
}
}

public boolean equals(Object o) {
 if ((o instanceof _cls_Post0))
{return true;}
else
{return false;}
}

public int hashCode() {
return 0;
}

public void _call(String _info, int... _event){
synchronized(_cls_Post0_instances){
_performLogic_testing(_info, _event);
}
}

public void _call_all_filtered(String _info, int... _event){
}

public static void _call_all(String _info, int... _event){

_cls_Post0[] a = new _cls_Post0[1];
synchronized(_cls_Post0_instances){
a = _cls_Post0_instances.keySet().toArray(a);}
for (_cls_Post0 _inst : a)

if (_inst != null) _inst._call(_info, _event);
}

public void _killThis(){
try{
if (--no_automata == 0){
synchronized(_cls_Post0_instances){
_cls_Post0_instances.remove(this);}
}
else if (no_automata < 0)
{throw new Exception("no_automata < 0!!");}
}catch(Exception ex){ex.printStackTrace();}
}

int _state_id_testing = 57;

public void _performLogic_testing(String _info, int... _event) {

_cls_Post0.pw.println("[testing]AUTOMATON::> testing("+") STATE::>"+ _string_testing(_state_id_testing, 0));
_cls_Post0.pw.flush();

if (0==1){}
else if (_state_id_testing==57){
		if (1==0){}
		else if ((_occurredEvent(_event,50/*goodApiPost*/)) && (value ==true )){
		
		_state_id_testing = 57;//moving to state postCall
		_goto_testing(_info);
		}
		else if ((_occurredEvent(_event,50/*goodApiPost*/)) && (value ==false )){
		
		_state_id_testing = 56;//moving to state invalidPost
		_goto_testing(_info);
		}
}
}

public void _goto_testing(String _info){
_cls_Post0.pw.println("[testing]MOVED ON METHODCALL: "+ _info +" TO STATE::> " + _string_testing(_state_id_testing, 1));
_cls_Post0.pw.flush();
}

public String _string_testing(int _state_id, int _mode){
switch(_state_id){
case 56: if (_mode == 0) return "invalidPost"; else return "!!!SYSTEM REACHED BAD STATE!!! invalidPost "+new _BadStateExceptionPost().toString()+" ";
case 57: if (_mode == 0) return "postCall"; else return "postCall";
default: return "!!!SYSTEM REACHED AN UNKNOWN STATE!!!";
}
}

public boolean _occurredEvent(int[] _events, int event){
for (int i:_events) if (i == event) return true;
return false;
}
}