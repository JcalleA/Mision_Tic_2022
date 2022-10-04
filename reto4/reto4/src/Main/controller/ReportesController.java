package Main.controller;
import java.sql.SQLException;
import java.util.List;
import Main.Model.dao.ComprasDeLiderDao;
import Main.Model.dao.DeudasPorProyectoDao;
import Main.Model.dao.ProyectoBancoDao;
import Main.Model.vo.ComprasDeLiderVo;
import Main.Model.vo.DeudasPorProyectoVo;
import Main.Model.vo.ProyectoBancoVo;

public class ReportesController {
    
        private ProyectoBancoDao proyectoBancoDao;
        private ComprasDeLiderDao comprasDeLiderDao;
        private DeudasPorProyectoDao pagadoPorProyectoDao;
    
        public ReportesController() {
            proyectoBancoDao = new ProyectoBancoDao();
            comprasDeLiderDao = new ComprasDeLiderDao();
            pagadoPorProyectoDao = new DeudasPorProyectoDao();
        }
    
        public List<ProyectoBancoVo> listarProyectosPorBanco(String banco) throws SQLException {
            return proyectoBancoDao.listar(banco);
        }
    
        /*/public List<DeudasPorProyectoVo> listarTotalAdeudadoProyectos(Double limite) throws SQLException {
            return pagadoPorProyectoDao.listar(limite);
        }
    
        public List<ComprasDeLiderVo> listarLideresQueMasGastan() throws SQLException {
            return comprasDeLiderDao.listar();
        }/* */
    
    
}
