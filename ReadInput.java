import java.io.FileReader;

public class ReadInput {
    public char[] getGraph(){
        try{
            FileReader fileReader = new FileReader("input.txt");
            int i;
            String data="";
            while((i = fileReader.read()) != -1){
                data = data + (char) i;
            }
            //System.out.println(data);
            fileReader.close();
            data = data.replace("/", "");
            data = data.replace("\n", "");
            data = data.replace(" ", "");
            char[] graph = data.toCharArray();
            return graph;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
