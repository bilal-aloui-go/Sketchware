DownloadManager downloadManager = (DownloadManager)getApplicationContext().getSystemService(android.content.Context.DOWNLOAD_SERVICE); 
DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));  
request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
request.setDestinationInExternalPublicDir(path, file_name);
downloadManager.enqueue(request);
