package com.dailymotion.android.player.sdk.events

import com.dailymotion.android.player.sdk.PlayerWebView

sealed class PlayerEvent(val name: String, open val payload: String?)

class GenericPlayerEvent internal constructor(override val payload: String?) : PlayerEvent("_generic_", payload)

class AddToCollectionRequestedEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_ADD_TO_COLLECTION_REQUESTED, payload)
class AdEndEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_AD_END, payload)
class AdPauseEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_AD_PAUSE, payload)
class AdPlayEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_AD_PLAY, payload)
class AdStartEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_AD_START, payload)
class AdTimeUpdateEvent internal constructor(override val payload: String?, val time: String?) : PlayerEvent(PlayerWebView.EVENT_AD_TIME_UPDATE, payload)
class ApiReadyEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_APIREADY, payload)
class ChromeCastRequestedEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_CHROME_CAST_REQUESTED, payload)
class ControlChangeEvent internal constructor(override val payload: String?, val controls: Boolean) : PlayerEvent(PlayerWebView.EVENT_CONTROLSCHANGE, payload)
class DurationChangeEvent internal constructor(override val payload: String?, val duration: String?) : PlayerEvent(PlayerWebView.EVENT_DURATION_CHANGE, payload)
class EndEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_END, payload)
class FullScreenToggleRequestedEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_FULLSCREEN_TOGGLE_REQUESTED, payload)
class GestureEndEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_GESTURE_END, payload)
class GestureStartEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_GESTURE_START, payload)
class LikeRequestedEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_LIKE_REQUESTED, payload)
class LoadedMetaDataEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_LOADEDMETADATA, payload)
class MenuDidHideEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_MENU_DID_HIDE, payload)
class MenuDidShowEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_MENU_DID_SHOW, payload)
class PauseEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_PAUSE, payload)
class PlaybackReadyEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_PLAYBACK_READY, payload)
class PlayEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_PLAY, payload)
class PlayingEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_PLAYING, payload)
class ProgressEvent internal constructor(override val payload: String?, val time: String?) : PlayerEvent(PlayerWebView.EVENT_PROGRESS, payload)
class QualitiesAvailableEvent internal constructor(override val payload: String?, val qualities: List<String>?) : PlayerEvent(PlayerWebView.EVENT_QUALITIES_AVAILABLE, payload)
class QualityChangeEvent internal constructor(override val payload: String?, val quality: String?) : PlayerEvent(PlayerWebView.EVENT_QUALITY_CHANGE, payload)
class SeekedEvent internal constructor(override val payload: String?, val time: String?) : PlayerEvent(PlayerWebView.EVENT_SEEKED, payload)
class SeekingEvent internal constructor(override val payload: String?, val time: String?) : PlayerEvent(PlayerWebView.EVENT_SEEKING, payload)
class ShareRequestedEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_SHARE_REQUESTED, payload)
class StartEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_START, payload)
class TimeUpdateEvent internal constructor(override val payload: String?, val time: String?) : PlayerEvent(PlayerWebView.EVENT_TIMEUPDATE, payload)
class VideoChangeEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_VIDEO_CHANGE, payload)
class VideoEndEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_VIDEO_END, payload)
class VideoStartEvent internal constructor(override val payload: String?, val replay: String?) : PlayerEvent(PlayerWebView.EVENT_VIDEO_START, payload)
class VolumeChangeEvent internal constructor(override val payload: String?, val volume: String?, val isMuted: Boolean) : PlayerEvent(PlayerWebView.EVENT_VOLUMECHANGE, payload)
class WatchLaterRequestedEvent internal constructor(override val payload: String?) : PlayerEvent(PlayerWebView.EVENT_WATCH_LATER_REQUESTED, payload)
class ErrorEvent internal constructor(override val payload: String?, val code: String?, val title: String?, val message: String?) : PlayerEvent(PlayerWebView.EVENT_ERROR, payload)