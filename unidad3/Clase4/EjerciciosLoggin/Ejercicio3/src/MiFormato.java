
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MiFormato extends Formatter{
    
    @Override
    public String format(LogRecord record){
        long millis = record.getMillis();
        Date fecha = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaTexto = sdf.format(fecha);
        
        return fechaTexto + " [" + record.getLevel() + "] " + record.getMessage() + "\n" ;
    }

}
