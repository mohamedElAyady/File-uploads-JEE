

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;

/**
 * Servlet implementation class FileUpload
 */
@WebServlet(name = "FileUploadServlet", urlPatterns = { "/fileuploadservlet" })
@MultipartConfig(
	  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
	  maxFileSize = 1024 * 1024 * 10,      // 10 MB
	  maxRequestSize = 1024 * 1024 * 100   // 100 MB
	)
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Receive file uploaded to the Servlet from the HTML5 form */
	    Part filePart = request.getPart("file");
	    String fileName = filePart.getSubmittedFileName();
	    for (Part part : request.getParts()) {
	      part.write("/File_upload/src/main/webapp/assets/" + fileName);
	    }
	    response.getWriter().print("The file uploaded sucessfully.");
	}

}
