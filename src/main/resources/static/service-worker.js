const CACHE_NAME = 'kjoregodtgjorelse-cache-v1';
const urlsToCache = [
  '/',
  '/index.html',
  '/css/bootstrap.min.css',
  // Legg til flere ressurser du ønsker cachet
];

self.addEventListener('install', event => {
  event.waitUntil(
    caches.open(CACHE_NAME)
      .then(cache => cache.addAll(urlsToCache))
  );
});

self.addEventListener('fetch', event => {
  event.respondWith(
    caches.match(event.request)
      .then(response => response || fetch(event.request))
  );
});
