
package maristas.dao;

import java.sql.*;
import java.util.ArrayList;
import maristas.beans.PlanOperativoBean;
import maristas.conexion.conecctionBDMysql;

public class PlanOperativoDAO {
    
    ArrayList<PlanOperativoBean> lista=null;
    Connection          cnn=null;
    PreparedStatement   pt=null;
    ResultSet           rs=null;
    
    public ArrayList<PlanOperativoBean> getPlanO(){
       lista = new ArrayList<PlanOperativoBean>();
       
       try{
            conecctionBDMysql cn = new conecctionBDMysql();
            cnn = cn.getConnection();

            pt=cnn.prepareStatement("select id, nombre,"
                    + " descripcion, id_plan_estrategico,"
                    + " id_encargado, id_unidad_org"
                    + " from PlanOperativo");

            rs=pt.executeQuery();


            while(rs.next()){
                PlanOperativoBean objPlanOp=new PlanOperativoBean();

                objPlanOp.setId(rs.getInt(1));
                objPlanOp.setNombre(rs.getString(2));
                objPlanOp.setDescripcion(rs.getString(3));
                objPlanOp.setId_plan_estrategico(rs.getInt(4));
                objPlanOp.setId_encargado(rs.getInt(5));
                objPlanOp.setId_unidad_organica(rs.getInt(6));

                lista.add(objPlanOp);                            
            }
            rs.close();
            pt.close();
            cnn.close();
            return lista;
       } 
       catch(Exception e){
           return lista;
       }
   }
   
   public int InsertarPlanOp(PlanOperativoBean objPlanOp) {
        int estado = 0;
        try{
            conecctionBDMysql cn = new conecctionBDMysql();
            cnn = cn.getConnection();
            pt=cnn.prepareStatement("insert into PlanOperativo(nombre,descripcion,id_plan_estrategico,id_encargado,id_unidad_org)" +
                    "values(?,?,?,?,?)");
            pt.setString(1, objPlanOp.getNombre());
            pt.setString(2, objPlanOp.getDescripcion());
            pt.setInt(3, objPlanOp.getId_plan_estrategico());
            pt.setInt(4, objPlanOp.getId_encargado());
            pt.setInt(5, objPlanOp.getId_unidad_organica());
            estado = pt.executeUpdate();
            pt.close();
            cnn.close();
        
        } catch(Exception e){           
        }
        return estado;
    }
}
