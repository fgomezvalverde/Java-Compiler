
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140220
// Thu May 22 21:20:09 CST 2014
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;

/** CUP v0.11b beta 20140220 generated parser.
  * @version Thu May 22 21:20:09 CST 2014
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\002\000\002\002\004\000\002\002\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\004\000\004\104\004\001\002\000\004\002\000\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\004\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


 

  public static analizador_lexico.Scanner s;
  public static int errors = 0;
  public static int warnings = 0;
  
  public static void main(String argv[]) {

    for (int i = 0; i < argv.length; i++) {
      try {
        
        System.out.println("\n...Creating Symbol-Table for ["+argv[i]+"]...\n");
	  s = new analizador_lexico.Scanner(new FileReader(argv[i]));
        Parser p = new Parser(s);
        p.parse();

       

      }
      catch (Exception e) {
        e.printStackTrace(System.out);
        System.exit(1);
      }
    }
  }


  public void report_error(String message, Object info) {
    if (info instanceof String){
	errors++; 
      System.err.println("  "+ errors + "==> " + info + " "+ message + 
					"\n       Parsing resumed from 2nd token before" + s.current_lexeme()+"\n");
    }
    else {
    	StringBuffer m = new StringBuffer("Error ");
    	if (info instanceof java_cup.runtime.Symbol) 
     	   m.append( "("+info.toString()+")" );     
    	m.append(" : "+message);   
    	System.err.println(m);
    }
  }

  public void sem_error(String lexeme, String message) {
	errors++;
     	System.err.println("Error "+ s.current_lexeme() + " : Semantic error");
      System.err.println("  "+ errors + "==> " + message + ": "+ lexeme + "\n");
  }

  public void warning(String lexeme, String message) {
	warnings++;
     	System.err.println("Warning "+ s.current_lexeme());
      System.err.println("  "+ warnings + "==> " + message + ": "+ lexeme + "\n");
  } 
  
  public void report_fatal_error(String message, Object info) {
    	report_error(message, info);
    	throw new RuntimeException("Fatal Syntax Error");
  }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {


	


  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= estructura EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // estructura ::= NULL_LITERAL 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("estructura",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}
