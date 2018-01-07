/*
 This file is part of Subsonic.

 Subsonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Subsonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Subsonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2009 (C) Sindre Mehus
 */
package exomodel.util;

/**
 * Used to display songs in a {@code ListView}.
 *
 * @author Sindre Mehus
 */
public class SongView
//        extends LinearLayout implements Checkable
{

//    private static final String TAG = SongView.class.getSimpleName();
//    private static final WeakHashMap<SongView, ?> INSTANCES = new WeakHashMap<SongView, Object>();
//    private static Handler handler;
//
//    private CheckedTextView checkedTextView;
//    private TextView titleTextView;
//    private TextView artistTextView;
//    private TextView durationTextView;
//    private TextView statusTextView;
//    private MusicDirectory.Entry song;
//
//    public SongView(Context context) {
//        super(context);
//        LayoutInflater.from(context).inflate(R.layout.song_list_item, this, true);
//
//        checkedTextView = (CheckedTextView) findViewById(R.id.song_check);
//        titleTextView = (TextView) findViewById(R.id.song_title);
//        artistTextView = (TextView) findViewById(R.id.song_artist);
//        durationTextView = (TextView) findViewById(R.id.song_duration);
//        statusTextView = (TextView) findViewById(R.id.song_status);
//
//        INSTANCES.put(this, null);
//        int instanceCount = INSTANCES.size();
//        if (instanceCount > 50) {
//            Log.w(TAG, instanceCount + " live SongView instances");
//        }
//        startUpdater();
//    }
//
//    public void setSong(MusicDirectory.Entry song, boolean checkable) {
//        this.song = song;
//        StringBuilder artist = new StringBuilder(40);
//
//        String bitRate = null;
//        if (song.getBitRate() != null) {
//        	bitRate = String.format(getContext().getString(R.string.song_details_kbps), song.getBitRate());
//        }
//
//        String fileFormat = null;
//        if (song.getTranscodedSuffix() != null && !song.getTranscodedSuffix().equals(song.getSuffix())) {
//        	fileFormat = String.format("%s > %s", song.getSuffix(), song.getTranscodedSuffix());
//    	} else {
//            fileFormat = song.getSuffix();
//        }
//
//        artist.append(song.getArtist()).append(" (")
//              .append(String.format(getContext().getString(R.string.song_details_all), bitRate == null ? "" : bitRate, fileFormat))
//              .append(")");
//
//        titleTextView.setText(song.getTitle());
//        artistTextView.setText(artist);
//        durationTextView.setText(Util.formatDuration(song.getDuration()));
//        checkedTextView.setVisibility(checkable && !song.isVideo() ? View.VISIBLE : View.GONE);
//
//        update();
//    }
//
//    private void update() {
//        DownloadService downloadService = DownloadServiceImpl.getInstance();
//        if (downloadService == null) {
//            return;
//        }
//
//        DownloadFile downloadFile = downloadService.forSong(song);
//        File completeFile = downloadFile.getCompleteFile();
//        File partialFile = downloadFile.getPartialFile();
//
//        int leftImage = 0;
//        int rightImage = 0;
//
//        if (completeFile.exists()) {
//            leftImage = downloadFile.isSaved() ? R.drawable.ic_stat_saved : R.drawable.ic_stat_downloaded;
//        }
//
//        if (downloadFile.isDownloading() && !downloadFile.isDownloadCancelled() && partialFile.exists()) {
//            statusTextView.setText(Util.formatLocalizedBytes(partialFile.length(), getContext()));
//            rightImage = R.drawable.ic_stat_downloading;
//        } else {
//            statusTextView.setText(null);
//        }
//        statusTextView.setCompoundDrawablesWithIntrinsicBounds(leftImage, 0, rightImage, 0);
//
//        boolean playing = downloadService.getCurrentPlaying() == downloadFile;
//        if (playing) {
//            titleTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_stat_play, 0, 0, 0);
//        } else {
//            titleTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
//        }
//    }
//
//    private static synchronized void startUpdater() {
//        if (handler != null) {
//            return;
//        }
//
//        handler = new Handler();
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                updateAll();
//                handler.postDelayed(this, 1000L);
//            }
//        };
//        handler.postDelayed(runnable, 1000L);
//    }
//
//    private static void updateAll() {
//        try {
//            for (SongView view : INSTANCES.keySet()) {
//                if (view.isShown()) {
//                    view.update();
//                }
//            }
//        } catch (Throwable x) {
//            Log.w(TAG, "Error when updating song views.", x);
//        }
//    }
//
//    @Override
//    public void setChecked(boolean b) {
//        checkedTextView.setChecked(b);
//    }
//
//    @Override
//    public boolean isChecked() {
//        return checkedTextView.isChecked();
//    }
//
//    @Override
//    public void toggle() {
//        checkedTextView.toggle();
//    }
}
