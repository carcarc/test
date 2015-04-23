public boolean isOnline(){

	final ConnectivityManager conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
	final NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();
	
	if (activeNetwork != null && activeNetwork.isConnected()) {
		return true;
	} else {
		return false;
	}
}
