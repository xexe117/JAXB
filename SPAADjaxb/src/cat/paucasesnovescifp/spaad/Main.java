package cat.paucasesnovescifp.spaad;

public class Main {

	public static void main(String[] args) {
		String rorigen = "/cat/paucasesnovescifp/spaad/arxius/";
		String rdesti = "/Users/Alumne/Desktop/JAXB/SPAADjaxb/src/";
	}
	
	Informacio parking = Processador.llegeixInformacio(pathOrigen + "parking.xml");
    System.out.println("parking = " + parking);
    if (parking != null) {
        Processador.escriuInformacio(pathDesti + "parkingEscrit.xml", parking);
    }
    } catch (JAXBException | IOException e) {
        System.out.println("Error: " + e.getMessage());
        e.printStackTrace();
    }
}