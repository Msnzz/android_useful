/**
	 * java.lang.OutOfMemoryError: pthread_create (1040KB stack) failed: Out of memory
	 */
	private void errorThreadUse(){
		for (int i = 0,size= 10000;i<size;i++){
			ImLog.i("tststs","number--->"+i);
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ImLog.i("tststs","thread is run---->"+Thread.currentThread().getName());
				}
			}).start();
		}
		ImLog.i("tststs","after for loop--->");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ImLog.i("tststs","after thread 5000--->");
	}

	private void correctThreadUse(){
		//线程池限制单个线程
		ExecutorService pool = Executors.newSingleThreadExecutor();
		for (int i = 0,size= 10000;i<size;i++){
			ImLog.i("tststs","number--->"+i);
			pool.execute(new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ImLog.i("tststs","thread is run---->"+Thread.currentThread().getName());
				}
			}));
		}
		ImLog.i("tststs","after for loop--->");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ImLog.i("tststs","after thread 5000--->");
		//停止所有线程
		pool.shutdownNow();
	}