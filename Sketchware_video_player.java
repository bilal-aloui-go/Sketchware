final VideoView video_view = new VideoView(this);
video_view.setVideoURI(Uri.parse(url));
video_view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
final ProgressDialog progressDialog = ProgressDialog.show(this, "","Please wait ...", false);
progressDialog.setCancelable(true);
MediaController mediaController = new MediaController(this);
video_view.setMediaController(mediaController);
video_view.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
public void onPrepared(MediaPlayer mp) {
progressDialog.dismiss();
video_view.start();}});
LinearLayout layout = findViewById(R.id.video_layout);
layout.addView(video_view);
