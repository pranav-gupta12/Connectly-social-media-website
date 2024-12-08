export const uploadToCloudinary = async (pics,fileType) => {
    
    if (pics && fileType) {

        console.log("pics",pics,fileType)
      
      const data = new FormData();
      data.append("file", pics);
      data.append("upload_preset", "Connectly");
      data.append("cloud_name", "dbrz3xu9t");
  
      const res = await 
      fetch(`https://api.cloudinary.com/v1_1/dbrz3xu9t/${fileType}/upload`, {
        method: "post",
        body: data,
      })
        
        const fileData=await res.json();
        console.log("url : ", fileData.url);
        return fileData.url
  
    } else {
      console.log("error");
    }
  };