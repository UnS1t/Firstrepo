
package backEnd;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Core {
    public Client[] client;
    public Database[] database;
    public Rent[] rent;
    public String patern = "dd/MM/yyyy";
    public SimpleDateFormat sdf = new SimpleDateFormat(patern);
    
    public Core(){
    	
       
    }
    
    public static void main(String args[]) throws IOException, FileNotFoundException, ParseException{
    Core test = new Core();
    test.List();
    
    gui.Menu yo = new gui.Menu();
    yo.start();
    
    }
    
    public void List() throws FileNotFoundException, IOException, ParseException{
        Client c = new Client();
        client = new Client[c.ArraySize()];
        for (int i = 0; i < client.length; i++) 
            client[i].GiveList(i);
         
            Database d = new Database();
            database = new Database[d.ArraySize()];
            for (int i = 0; i < database.length; i++) 
                database[i].GiveList(i);
                
            Rent r = new Rent();
            rent = new Rent[r.ArraySize()];
            for (int i = 0; i < rent.length; i++) 
            rent[i].GiveList(i);
        }
    public void add(List<String> data, String what) throws IOException, ParseException{
        int id;
        
        switch(what){
            case "client":
                id = client.length + 1;
                for (int i = 0; i < client.length; i++) {
            if(client[i].ID != i){
                id = i;
                break;
            }
            
        }
                Client addClient = new Client(id,
                        data.get(0),data.get(1),data.get(2));
                addClient.addingClient();
            break;
            case "database":
                 id = database.length + 1;
                for (int i = 0; i < database.length; i++) {
            if(database[i].ID != i){
                id = i;
                break;
            }
            
        }
                Database addDat = new Database(id,
                        data.get(0),Integer.parseInt(data.get(1)),data.get(2),
                        Boolean.parseBoolean(data.get(4)));
               addDat.addingVcr();
                break;
            case "rent":
                 id = rent.length + 1;
                for (int i = 0; i < rent.length; i++) {
            if(client[i].ID != i){
                id = i;
                break;
            }
            
        }
                Rent addRent = new Rent(id,
                        data.get(0),
                        Integer.parseInt(data.get(1)),
                        sdf.parse(data.get(2)),sdf.parse(data.get(3)));
                addRent.renting();
                break;
                
        }
        List();
    }
    public void del(List<String> data, int arrayLoc, String what) throws ParseException, IOException{
        
        switch(what){
            case "client":
                Client delClient = new Client(Integer.parseInt(data.get(0)),
                        data.get(1),
                        data.get(2),data.get(3));
                delClient.delettingClient(arrayLoc);
            break;
            case "database":
                Database delDat = new Database(Integer.parseInt(data.get(0)),
                        data.get(1),Integer.parseInt(data.get(2)),data.get(3),
                        Boolean.parseBoolean(data.get(4)));
               delDat.delettingVcr();
                break;
            case "rent":
                Rent delRent = new Rent(Integer.parseInt(data.get(0)),
                        data.get(1),
                        Integer.parseInt(data.get(2)),
                        sdf.parse(data.get(3)),sdf.parse(data.get(4)));
                delRent.unRenting(delRent.billID);
                break;
        }
        List();
    }
        public void edit(List<String> data,int arrayLoc, String what) throws IOException, ParseException{
            
            switch(what){
            case "client":
                Client editClient = new Client(Integer.parseInt(data.get(0)),
                        data.get(1),
                        data.get(2),data.get(3));
                editClient.addingClient();
            break;
            case "database":
                Database editDat = new Database(Integer.parseInt(data.get(0)),
                        data.get(1),Integer.parseInt(data.get(2)),data.get(3),
                        Boolean.parseBoolean(data.get(4)));
               editDat.editVcr(arrayLoc, data);
                break;
                
        }
            List();
        }
        
        
        
     
    
    }


