
import java.util.ArrayList;

public class StateNodes {

    ArrayList<String> stateConections = new ArrayList<String>();
    ArrayList<String> NFA_States_Holder = new ArrayList<String>();
    ArrayList<String> NFA_States = new ArrayList<String>();
    ArrayList<String> NFA_Holding = new ArrayList<String>();
    String stateID = null;
    Boolean is_A_Final_State = false;
    Boolean is_A_Start_State = false;
    Boolean is_The_Sink_State = false;
    Boolean this_Diagram_Is_An_NFA = false;
    Boolean NFA_e_Trans_Done = false;

    /**
     * This class assigns stateID upon construction
     */
    public StateNodes(String stateId) {
        stateID = stateId;
    }

    /**
     * Sets the stateID
     *
     * @param stateId
     */
    public void set_State_ID(String stateId) {
        stateID = stateId;
    }

    /**
     * Returns the current state nodes identification string
     *
     * @return stateID
     */
    public String return_ID() {
        return stateID;
    }

    /**
     * Designates the current state node as a final state
     */
    public void set_As_A_Final_State() {
        is_A_Final_State = true;
    }

    /*
     * Returns true if the current state node is a final state
     */
    public Boolean is_This_A_Final_State() {
        return is_A_Final_State;
    }

    /**
     * Sets the current state as a starting state
     */
    public void set_As_The_Starting_State() {
        is_A_Start_State = true;
    }

    /**
     * Returns true if the current state is a starting state
     *
     * @return is_A_Start_State
     */
    public Boolean is_This_The_Starting_State() {
        return is_A_Start_State;
    }

    /**
     * Sets the current state as a sink state
     */
    public void set_As_The_Sink_State() {
        is_The_Sink_State = true;
    }

    /**
     * Returns true if the current state is a sink state
     *
     * @return is_The_Sink_State
     */
    public Boolean is_This_The_Sink_State() {
        return is_The_Sink_State;
    }

    /**
     * Adds a connection to this state
     *
     * @param element
     * @param connection
     * @return this_Diagram_Is_An_NFA
     */
    public Boolean add_Connection(String element, String connection) {
        if (element.equals("e")) {
            this_Diagram_Is_An_NFA = true;
        }
        String temp = element.concat(connection);
        stateConections.add(temp);
        return this_Diagram_Is_An_NFA;
    }

    /**
     * Returns element connected stateId, or returns "false" if not found
     *
     * @param element
     * @return
     */
    public String find_Connection_DFA(String element) {
        Boolean found = false;
        String temp;
        int i = 0;
        if (stateConections.isEmpty()) {
            return "false";
        }
        while ((i < stateConections.size()) && (found == false)) {
            temp = stateConections.get(i);
            temp = temp.substring(0, 1);
            if (temp.equals(element)) {
                found = true;
            }
            if (found == false) {
                i++;
            }
        }
        if (found == true) {
            element = stateConections.get(i);
            element = element.substring(1);
            //System.out.println("connection found from: " + stateID + " to: " + element);
            return element;
        }
        return "false";
    }

    /**
     * Adds stateId to NFA_States ArrayList; which keeps track of e-transition
     * connections
     *
     * @param stateId
     */
    public void add_NFA_StateIds(String stateId) {
        NFA_States.add(stateId);
    }
}