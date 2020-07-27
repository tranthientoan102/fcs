package EmergencyServiceSystem;


public class ServiceCenter {
    private WaitingList awl;

    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /**
     * Record patient's data and add the patient into waiting list
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */
    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location);
        if(this.awl.isInList(patient)){
            System.out.println(patient.getName() + " is in waiting list. ");
        }else{
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }

    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     * @return the patient object
     */
    public Patient assignAmbulanceForPatient() {
        Patient patient = this.awl.popPatient();
        if (patient != null) {
            System.out.println("Assigned an ambulance for patient: " + patient.getName());
        } else {
            System.out.println("Error! The waiting list is empty.");
        }
        return patient;
    }

    public Patient assignAmbulanceForPatientById(int id) {
        Patient patient = this.awl.popPatientById(id);
        if (patient != null) {
            System.out.printf("Success! An ambulance as assigned for patient %d.\n", id);
            System.out.println(patient.toString());
        } else {
            System.out.printf("Patient Id %d is not found in waiting list.\n",id);
        }

        return patient;
    }

    public int checkPositionById(int id){
        int index = this.awl.numNodes;
        Node current = this.awl.head;
        while (current!= null){
            if (current.getPatient().getId() == id) {
                // found index of input id
                return index;
            }
            else {
                // go to next node and continue checking
                current = current.getNext();
                index--;
            }
        }
        // go through all nodes but couldn't find
        return -1;
    }

    /**
     * Print out the waiting list
     */
    public void printWaitingList(){
        this.awl.printList();
    }
}
