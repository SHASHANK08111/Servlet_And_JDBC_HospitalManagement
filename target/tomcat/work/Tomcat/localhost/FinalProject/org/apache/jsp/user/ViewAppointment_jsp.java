/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-05-24 06:17:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.db.DBConnect;
import java.util.*;
import com.virtusa.dao.AppointmentDao;
import com.virtusa.Service.AppointmentService;
import com.virtusa.dao.DoctorDao;
import com.virtusa.dao.slotDao;
import java.util.ArrayList;
import com.virtusa.entity.Specialist;
import com.virtusa.entity.User;
import com.virtusa.entity.Doctor;
import com.virtusa.entity.Slot;
import com.virtusa.entity.Appointment;

public final class ViewAppointment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/user/../components/allcss.jsp", Long.valueOf(1715248437787L));
    _jspx_dependants.put("/user/../components/navbar.jsp", Long.valueOf(1715862377583L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Book Appointment</title>\r\n");
      out.write("    ");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" \r\n");
      out.write("      rel=\"stylesheet\" \r\n");
      out.write("      integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" \r\n");
      out.write("      crossorigin=\"anonymous\">\r\n");
      out.write("      \r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>");
      out.write(" \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../components/navbar.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("       body {\r\n");
      out.write("            background-color: #f8f9fa;\r\n");
      out.write("        }\r\n");
      out.write("        .appointment-card {\r\n");
      out.write("            border: 1px solid #ddd;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("        .appointment-card .card-body {\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .label {\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-block {\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <nav class=\"navbar navbar-expand-lg navbar-dark navbar-custom\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("         <a class=\"navbar-brand\" href=\"index.jsp\">My Doctor</a>\r\n");
      out.write("         <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("         </button>\r\n");
      out.write("         <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("               \r\n");
      out.write("              ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               \r\n");
      out.write("             ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("            </ul>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </nav>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
 
        int userId = -1;
        Object userObj = request.getSession().getAttribute("userObj");
        if(userObj != null && userObj instanceof User) {
            User user = (User) userObj;
            userId = user.getUserId();
        }
        List<Appointment> appointmetsOfUser = null;
        if(userId != -1) {

            AppointmentService appointmentSevice=new AppointmentService(DBConnect.getConnection());
            appointmetsOfUser = appointmentSevice.getAppointmentByUserId(userId);
        }
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   <div class=\"container mt-4\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        ");
 
        if (appointmetsOfUser != null && !appointmetsOfUser.isEmpty()) {
            for (Appointment appointment : appointmetsOfUser) {
            DoctorDao ddao=new DoctorDao(DBConnect.getConnection());
            Doctor doctor=ddao.getDoctorbyId(appointment.getDoctorId());
        
      out.write("\r\n");
      out.write("        <div class=\"col-md-6 mb-4\">\r\n");
      out.write("            <div class=\"c ard appointment-card\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title mb-3\">My Appointment</h5>\r\n");
      out.write("                    <p class=\"card-text\"><span class=\"label\">Doctor:</span> <span class=\"value\">");
      out.print( appointment.getDoctorName() );
      out.write("</span></p>\r\n");
      out.write("                    <p class=\"card-text\"><span class=\"label\">Date:</span> <span class=\"value\">");
      out.print( appointment.getAppointmentDate() );
      out.write("</span></p>\r\n");
      out.write("                    <p class=\"card-text\"><span class=\"label\">Slot:</span> <span class=\"value\">");
      out.print( appointment.getSlot() );
      out.write("</span></p>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"comment\">Comment:</label>\r\n");
      out.write("                        <textarea class=\"form-control\" rows=\"4\" id=\"comment\" readonly>");
      out.print( appointment.getComment() != null ? appointment.getComment() : "No Comment" );
      out.write("</textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button type=\"button\"  id=\"virtualMeet\" onclick=\"redirectToVirtualDoctor('");
      out.print( doctor.getLink() );
      out.write("')\" class=\"btn btn-primary btn-block\" ");
      out.print( appointment.getisLinkInvite() != false ? "" : "disabled" );
      out.write(">\r\n");
      out.write("                        JOIN VIRTUAL DOCTOR\r\n");
      out.write("                    </button>\r\n");
      out.write("                     <script>\r\n");
      out.write("\t\t\t\t\t\t    function redirectToVirtualDoctor(link) {\r\n");
      out.write("\t\t\t\t\t\t        window.location.href = link;\r\n");
      out.write("\t\t\t\t\t\t    }\r\n");
      out.write("-                    </script>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 
            }
        } else {
        
      out.write("\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("            <div class=\"alert alert-warning\" role=\"alert\">\r\n");
      out.write("                No appointments found.\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("   \r\n");
      out.write("     <script>\r\n");
      out.write("        function redirectToVirtualDoctor(link) {\r\n");
      out.write("            window.location.href = link;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /user/../components/navbar.jsp(25,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userObj}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("              \r\n");
        out.write("               <li class=\"nav-item\">\r\n");
        out.write("                  <a class=\"nav-link\" href=\"user/BookAppointment.jsp\">Book Appointment</a>\r\n");
        out.write("               </li>\r\n");
        out.write("               <li class=\"nav-item\">\r\n");
        out.write("                  <a class=\"nav-link\" href=\"#\">Medicines</a>\r\n");
        out.write("               </li>\r\n");
        out.write("               <li class=\"nav-item dropdown\">\r\n");
        out.write("                  <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
        out.write("                  Login\r\n");
        out.write("                  </a>\r\n");
        out.write("                  <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
        out.write("                     <li><a class=\"dropdown-item\" href=\"user-login.jsp\">User</a></li>\r\n");
        out.write("                    ");
        out.write("\r\n");
        out.write("                     <li><a class=\"dropdown-item\" href=\"doctor-login.jsp\">Doctor</a></li>\r\n");
        out.write("                  </ul>\r\n");
        out.write("               </li>\r\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /user/../components/navbar.jsp(45,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty userObj}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \r\n");
        out.write("               <li class=\"nav-item\">\r\n");
        out.write("                  <a class=\"nav-link\" href=\"../user/BookAppointment.jsp\">Book Appointment</a>\r\n");
        out.write("               </li>\r\n");
        out.write("               <li class=\"nav-item\">\r\n");
        out.write("                  <a class=\"nav-link\" href=\"../user/ViewAppointment.jsp\">My Appointments</a>\r\n");
        out.write("               </li>\r\n");
        out.write("               \r\n");
        out.write("               <div class=\"nav-item dropdown active\">\r\n");
        out.write("            <button class=\"btn dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
        out.write("              <i class=\"fa-solid fa-circle-user\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userObj.firstName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("            </button>\r\n");
        out.write("            <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton1\">\r\n");
        out.write("              <li><a class=\"dropdown-item\" href=\"../user-logout\">LogOut</a></li>\r\n");
        out.write("            </ul>\r\n");
        out.write("          </div>\r\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
